package com.finalthesis.AttendanceSystem.db.service.impl;


import com.finalthesis.AttendanceSystem.db.service.api.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CodeServiceImpl implements CodeService {

    @Autowired
    private ConcurrentMapCache myCache;


    @Override
    public String generate(Integer id_predmet) {
        String uuid = UUID.randomUUID().toString();
        myCache.put(uuid, id_predmet); //java.util.uuid

        return uuid;
    }

    @Override
    public void validate(String uuidCode, Integer id_student) {
        Cache.ValueWrapper valueWrapper = myCache.get(uuidCode);

        if(valueWrapper != null) {
            var id_predmet = valueWrapper.get();
        } else  {
            throw new RuntimeException("Chyba");
        }
    }
}
