package com.finalthesis.AttendanceSystem.db.service.impl;


import com.finalthesis.AttendanceSystem.db.repository.DochadzkaRepository;
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

    @Autowired
    private DochadzkaRepository dochadzkaRepository;

    @Override
    public String generate(Integer id_predmet) {
        String uuid = UUID.randomUUID().toString();
        myCache.put(uuid, id_predmet); //java.util.uuid

        return uuid;
    }

    @Override
    public void validate(String uuidCode, Integer id_student) {
        Cache.ValueWrapper valueWrapper = myCache.get(uuidCode); //get hľada jedinčený atomický záznam teda UUID code

        if(valueWrapper != null) {
            var id_predmet = valueWrapper.get(); //do id_predmet sa uloží konretny predemt ku ktoremu bol vygenerovany kluc
            dochadzkaRepository.createNewDochadzka(id_predmet,id_student);
        } else  {
            throw new RuntimeException("Chyba");
        }
    }
}
