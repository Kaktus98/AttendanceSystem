package com.finalthesis.AttendanceSystem.domain;

import io.micrometer.common.lang.NonNull;

public class DochadzkaSkupina {

    @NonNull
    private Integer id_predmet;
    @NonNull
    private Integer id_student;
    @NonNull
    private String meno;
    @NonNull
    private String priezvisko;

    public DochadzkaSkupina(@NonNull Integer id_predmet, @NonNull Integer id_student, @NonNull String meno, @NonNull String priezvisko) {
        this.id_predmet = id_predmet;
        this.id_student = id_student;
        this.meno = meno;
        this.priezvisko = priezvisko;
    }

    @NonNull
    public Integer getId_predmet() {
        return id_predmet;
    }

    public void setId_predmet(@NonNull Integer id_predmet) {
        this.id_predmet = id_predmet;
    }

    @NonNull
    public Integer getId_student() {
        return id_student;
    }

    public void setId_student(@NonNull Integer id_student) {
        this.id_student = id_student;
    }

    @NonNull
    public String getMeno() {
        return meno;
    }

    public void setMeno(@NonNull String meno) {
        this.meno = meno;
    }

    @NonNull
    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(@NonNull String priezvisko) {
        this.priezvisko = priezvisko;
    }
}
