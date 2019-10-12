package com.jingdu.lanjing.vote.modules.login.vo.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author zyc
 * @title: UserReqVo
 * @date 2019/10/12  15:45
 */
@Data
@ApiModel("登录入口入参")
public class UserReqVo implements Serializable {

    @ApiModelProperty(value = "用户名",required = true)
    private String userName;

    @ApiModelProperty(value = "用户密码",required = true)
    private  String userPwd;

    @ApiModelProperty(value = "图形验证码",required = true)
    private  String imgCode;


}
