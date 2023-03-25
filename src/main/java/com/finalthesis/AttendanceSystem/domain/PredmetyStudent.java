package com.finalthesis.AttendanceSystem.domain;

import io.micrometer.common.lang.NonNull;

public class PredmetyStudent {

    @NonNull
    private String nazov_predmetu;

    public PredmetyStudent(@NonNull String nazov_predmetu) {
        this.nazov_predmetu = nazov_predmetu;
    }

    @NonNull
    public String getNazov_predmetu() {
        return nazov_predmetu;
    }

    public void setNazov_predmetu(@NonNull String nazov_predmetu) {
        this.nazov_predmetu = nazov_predmetu;
    }
}
