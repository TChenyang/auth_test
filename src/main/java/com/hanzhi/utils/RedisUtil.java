package com.hanzhi.utils;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @author Administrator
 * @Title: RedisUtil
 * @ProjectName auth_test
 * @Description: TODO
 * @date 2019/4/19 001917:32
 */
@Component
public class RedisUtil {
    @Resource
    private RedisTemplate<String,String> redisTemplate;

    public void set(String key,String value){
        ValueOperations<String,String> valueOperations = redisTemplate.opsForValue();
        valueOperations.set(key,value);
    }

}
