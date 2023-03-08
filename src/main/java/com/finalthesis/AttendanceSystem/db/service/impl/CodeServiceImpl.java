package com.finalthesis.AttendanceSystem.db.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.stereotype.Service;

@Service
public class CodeServiceImpl {

    @Autowired
    private ConcurrentMapCache myCache;

    public void put(String key, String value) {
        myCache.put(key, value);
    }

    public String get(String key) {
        Cache.ValueWrapper valueWrapper = myCache.get(key);
        if (valueWrapper != null) {
            return (String) valueWrapper.get();
        }
        return null;
    }
}
