package com.hanzhi.service;

public interface IRedisService {
    String get(String key);
    void set(String key,Object val);
    <T> T get(String key,Class<T> cls);
}
