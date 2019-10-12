package com.jingdu.lanjing.vote.modules.login.vo.resp;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author zyc
 * @title: UserRespVo
 * @date 2019/10/12  16:07
 */
@Data
public class UserRespVo implements Serializable {

    @ApiModelProperty(value = "用户id",required = true)
    private String userId;

    @ApiModelProperty(value = "用户名",required = true)
    private String userName;

    @ApiModelProperty(value = "用户密码",required = true)
    private  String userPwd;

    
}
