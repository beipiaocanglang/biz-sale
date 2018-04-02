package com.biz.service;

import com.biz.common.ResultDTO;
import com.biz.domain.SaleLoginUser;

import java.util.List;

/**
 * 用户登录接口
 */
public interface IUserClient {

    /**
     * 用户注册
     */
    ResultDTO userRegister(SaleLoginUser saleLoginUser);

    /**
     * 根据用户名查询用户信息
     */
    ResultDTO findUserInfoByUserName(String loginName);

    /**
     * 用户登录
     */
    ResultDTO<SaleLoginUser> userLogin(String loginName, String password);

    /**
     * 查询所有用户
     */
    ResultDTO<List<SaleLoginUser>> findAllUser();
}
