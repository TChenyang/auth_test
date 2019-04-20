package com.hanzhi.service.serviceImpl;

import com.hanzhi.service.IRedisService;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @Title: IRedisServiceImpl
 * @ProjectName auth_test
 * @Description: TODO
 * @date 2019/4/20 002017:27
 */
@Service
public class IRedisServiceImpl implements IRedisService {
    @Resource
    private RedisTemplate<String,Object> redisTemplate;

    @Override
    public String get(String key) {
        return get(key,String.class);
    }

    @Override
    public void set(String key, Object val) {
        redisTemplate.opsForValue().set(key,val);
    }

    @Override
    @SuppressWarnings({"unchecked", "ConstantConditions"})
    public <T> T get(String key, Class<T> cls) {
        Object val = redisTemplate.opsForValue().get(key);
        if (val==null){
            return null;
        }
        if(val.getClass().isAssignableFrom(cls)){
            return (T) val;
        }
        throw new IllegalArgumentException();
    }


}
