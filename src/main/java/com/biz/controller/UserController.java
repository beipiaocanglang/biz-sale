package com.biz.controller;

import com.biz.common.*;
import com.biz.domain.SaleLoginUser;
import com.biz.service.IUserClient;
import com.biz.util.AES;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Locale;

@Controller
@ResponseBody
@RequestMapping("/api/user/")
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Resource
    private IUserClient userClient;

    @Resource
    private MessageSource messageSource;

    @Value("${COOKIE_TIMEOUT}")
    private int COOKIE_TIMEOUT;

    /**
     * 用户注册
     * api/user/register
     *
     * @return
     */
    @GetMapping("register")
    public Object userRegister(SaleLoginUser saleLoginUser) {

        ResultDTO registerResult = userClient.userRegister(saleLoginUser);

        return registerResult;
    }

    /**
     * api/user/login
     * 用户登录
     */
    @GetMapping("login/{loginName}/{password}")
    public Object userLogin(HttpServletResponse response, HttpServletRequest request, @PathVariable String loginName, @PathVariable String password) throws Exception {

        ResultDTO<SaleLoginUser> selectResult = userClient.userLogin(loginName, password);

        log.info("登陆后的用户信息：" + JsonUtil.toJson(selectResult));

        //登录成功后将用户信息存入cookie中
        if (selectResult.getSuccess() && selectResult.getData() != null) {
            SaleLoginUser saleLoginUser = selectResult.getData();

            String userName = saleLoginUser.getLoginname();

            String userFlag = null;

            userFlag = AES.aesEncrypt(userName+"<split>"+saleLoginUser.getPassword(), "");

            //cookie过期时间7天
            CookieUtils.setCookie(request, response, "USN", userFlag, COOKIE_TIMEOUT, true);
        }

        //String message = messageSource.getMessage("1100", (Object[])null, Locale.getDefault());

        return selectResult;
    }

    /**
     * api/user/findAllUserInfo
     * 查询所有用户
     * @return
     */
    @GetMapping("findAllUserInfo")
    public Object findAllUserInfo(){

        ResultDTO<List<SaleLoginUser>> userLists = userClient.findAllUser();

        return userLists;
    }
}
