package com.jingdu.lanjing.vote.common.utils;

/**
 * Redis所有Keys
 */
public class RedisKeys {

    public static String getVoteConfigKey(String key){
        return "Vote:config:" + key;
    }
}
