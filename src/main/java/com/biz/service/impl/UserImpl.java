package com.biz.service.impl;

import com.biz.common.IDUtils;
import com.biz.common.JsonUtil;
import com.biz.common.ResultDTO;
import com.biz.common.ResultDTOBuilder;
import com.biz.domain.SaleLoginUser;
import com.biz.util.AES;
import org.apache.commons.lang3.StringUtils;
import com.biz.mapper.SaleLoginUserMapper;
import com.biz.service.IUserClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户登录测试类
 */
@Service
public class UserImpl implements IUserClient {
    private static final Logger log = LoggerFactory.getLogger(UserImpl.class);
    @Resource
    private SaleLoginUserMapper saleLoginUserMapper;

    /**
     * 用户注册
     * @param saleLoginUser
     * @return
     */
    public ResultDTO userRegister(SaleLoginUser saleLoginUser) {

        //手动设置id
        saleLoginUser.setId(IDUtils.currentTimeMillis());

        if (StringUtils.isBlank(saleLoginUser.getLoginname())) {
            return ResultDTOBuilder.failure("10002", "用户名不能为空");
        }
        if (StringUtils.isBlank(saleLoginUser.getPassword())) {
            return ResultDTOBuilder.failure("10002", "密码不能为空");
        }

        //DigestUtils是spring提供的工具类
        saleLoginUser.setPassword(AES.base64Encode(saleLoginUser.getPassword().getBytes()));

        ResultDTO<SaleLoginUser> userInfo = this.findUserInfoByUserName(saleLoginUser.getLoginname());

        if (userInfo.getSuccess()) {
            if (userInfo.getData() != null) {
                return ResultDTOBuilder.failure("10006", "用户名已存在");
            }
        } else if(!userInfo.getSuccess()){
            return ResultDTOBuilder.failure(userInfo.getErrCode(), userInfo.getErrMsg());
        }

        try {
            int insertNum = saleLoginUserMapper.save(saleLoginUser);

            if (insertNum == 0){
                return ResultDTOBuilder.failure("10003", "注册失败，请稍后重试");
            }

            return ResultDTOBuilder.success(true);
        } catch (Exception e) {
            log.error("impl - 用户注册(异常)：", e);
            return ResultDTOBuilder.failure("10003", "服务异常，请稍后重试");
        }
    }

    /**
     * 根据用户名查询用户信息
     * @param loginName
     * @return
     */
    public ResultDTO<SaleLoginUser> findUserInfoByUserName(String loginName) {
        try {
            //查询用户信息
            SaleLoginUser saleLoginUsers = saleLoginUserMapper.findUserByLoginName(loginName);

            return ResultDTOBuilder.success(saleLoginUsers);
        } catch (Exception e) {
            log.error("impl - 根据用户名查询过用户信息(异常)：", e);
            return ResultDTOBuilder.failure("10003", "服务异常，请稍后重试");
        }
    }

    /**
     * 用户登录
     * @param loginName
     * @param password
     * @return
     */
    public ResultDTO<SaleLoginUser> userLogin(String loginName, String password) {

        ResultDTO<SaleLoginUser> saleLoginUsers = this.findUserInfoByUserName(loginName);

        if (!saleLoginUsers.getSuccess()){
            return saleLoginUsers;
        }

        if (saleLoginUsers == null){
            return ResultDTOBuilder.failure("10004", "用户名不存在，请核对后重试");
        }

        String userPass = null;
        try {
            userPass = AES.aesEncrypt(password,"");
        } catch (Exception e) {
            e.printStackTrace();
            return ResultDTOBuilder.failure("-99999", "系统出错");
        }

        SaleLoginUser saleLoginUser = saleLoginUsers.getData();

        if (!saleLoginUser.getPassword().equals(userPass)) {
            return ResultDTOBuilder.failure("10004", "密码错误，请重新输入");
        }

        return ResultDTOBuilder.success(saleLoginUser);
    }

    /**
     * 查询所有用户
     * @return
     */
    public ResultDTO<List<SaleLoginUser>> findAllUser() {

        try {
            List<SaleLoginUser> userList = saleLoginUserMapper.selectAll();

            return ResultDTOBuilder.success(userList);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultDTOBuilder.failure("10003", "服务异常，请稍后重试");
        }
    }
}
