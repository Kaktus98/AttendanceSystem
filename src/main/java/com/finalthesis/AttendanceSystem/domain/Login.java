package com.finalthesis.AttendanceSystem.domain;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

public class Login {
    @NonNull
    private Integer id;
    @NonNull
    private String rola;

    public Login(@NonNull Integer id, @NonNull String rola) {
        this.id = id;
        this.rola = rola;
    }

    @NonNull
    public Integer getId() {
        return id;
    }

    public void setId(@NonNull Integer id) {
        this.id = id;
    }

    @NonNull
    public String getRola() {
        return rola;
    }

    public void setRola(@NonNull String rola) {
        this.rola = rola;
    }
}
