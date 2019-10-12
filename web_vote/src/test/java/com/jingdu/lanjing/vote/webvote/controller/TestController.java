package com.jingdu.lanjing.vote.webvote.controller;

import com.alibaba.fastjson.JSON;
import com.jingdu.lanjing.vote.common.utils.RedisUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zyc
 * @title: TestController
 * @date 2019/10/12  14:59
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestController {

    @Autowired
    private RedisUtils redisUtils;

    /**
     * 测试redis
     */
    @Test
    public void redistest() {
        redisUtils.set("11111","888888888888888");
        System.out.println("---------------------"+JSON.toJSONString(redisUtils.get("11111")));
    }



}
