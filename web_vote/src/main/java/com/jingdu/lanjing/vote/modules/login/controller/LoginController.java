package com.jingdu.lanjing.vote.modules.login.controller;

import com.jingdu.lanjing.vote.common.utils.R;
import com.jingdu.lanjing.vote.modules.login.util.CheckImgUtil;
import com.jingdu.lanjing.vote.modules.login.vo.req.UserReqVo;
import com.jingdu.lanjing.vote.modules.login.vo.resp.UserRespVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录入口
 * @author zyc
 * @title: LoginController
 * @date 2019/10/12  15:49
 */
@Api(tags = "登录入口")
@RestController
@RequestMapping("/login")
public class LoginController {


    @PostMapping("getImgCode")
    @ApiOperation("获取图形验证码")
    public void getImgCode(HttpServletRequest request , HttpServletResponse response) throws Exception{
        //获取验证码
        CheckImgUtil.checkImg(request, response);
        //将生成的四位验证码从session中取出来
        String str = (String) request.getSession().getAttribute("checkcode");
        System.out.println("============="+str);
    }

    @PostMapping("/loginUser")
    @ApiOperation("登录")
    public UserRespVo loginUser(@RequestBody UserReqVo vo , HttpServletRequest request){
     return null;
    }

}
