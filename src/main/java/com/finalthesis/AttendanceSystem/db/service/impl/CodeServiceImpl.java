package com.finalthesis.AttendanceSystem.db.service.impl;


import com.finalthesis.AttendanceSystem.db.service.api.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.stereotype.Service;

@Service
public class CodeServiceImpl implements CodeService {

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


    @Override
    public String generate(Integer id_predmet) {
        myCache.put("uuid kod", id_predmet);

        return "my uuid";
    }

    @Override
    public void validate(String uuidCode, Integer id_student) {
        Cache.ValueWrapper valueWrapper = myCache.get(uuidCode);

        if(valueWrapper != null) {
            var idPredmet = valueWrapper.get();
        } else  {
            throw new RuntimeException("Chyba");
        }
    }
}
