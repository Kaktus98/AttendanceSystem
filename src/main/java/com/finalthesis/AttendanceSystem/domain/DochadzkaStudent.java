package com.finalthesis.AttendanceSystem.domain;

import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

import java.util.Date;

public class DochadzkaStudent {

    @Nullable
    private Integer id_dochadzkaStudent;

    @NonNull
    private String meno;

    @NonNull
    private String priezvisko;

    @NonNull
    private String den;

    @NonNull
    private String nazov_predmetu;

    @Nullable
    private Boolean status;

    @NonNull
    private Date datum;

    public DochadzkaStudent(@Nullable Integer id_dochadzkaStudent, @NonNull String meno, @NonNull String priezvisko, @NonNull String den, @NonNull String nazov_predmetu, @Nullable Boolean status, @NonNull Date datum) {
        this.id_dochadzkaStudent = id_dochadzkaStudent;
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.den = den;
        this.nazov_predmetu = nazov_predmetu;
        this.status = status;
        this.datum = datum;
    }

    @Nullable
    public Integer getId_dochadzkaStudent() {
        return id_dochadzkaStudent;
    }

    public void setId_dochadzkaStudent(@Nullable Integer id_dochadzkaStudent) {
        this.id_dochadzkaStudent = id_dochadzkaStudent;
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

    @NonNull
    public String getDen() {
        return den;
    }

    public void setDen(@NonNull String den) {
        this.den = den;
    }

    @NonNull
    public String getNazov_predmetu() {
        return nazov_predmetu;
    }

    public void setNazov_predmetu(@NonNull String nazov_predmetu) {
        this.nazov_predmetu = nazov_predmetu;
    }

    @Nullable
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(@Nullable Boolean status) {
        this.status = status;
    }

    @NonNull
    public Date getDatum() {
        return datum;
    }

    public void setDatum(@NonNull Date datum) {
        this.datum = datum;
    }
}
