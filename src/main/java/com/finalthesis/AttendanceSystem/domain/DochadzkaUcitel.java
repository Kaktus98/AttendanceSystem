package com.finalthesis.AttendanceSystem.domain;

import io.micrometer.common.lang.NonNull;
import org.springframework.lang.Nullable;

public class DochadzkaUcitel {

    @NonNull
    private Integer id_dochadzka;

    @NonNull
    private String meno;

    @NonNull
    private String priezvisko;

    @Nullable
    private Boolean status;

    public DochadzkaUcitel(@NonNull Integer id_dochadzka, @NonNull String meno, @NonNull String priezvisko, @Nullable Boolean status) {
        this.id_dochadzka = id_dochadzka;
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.status = status;
    }

    @NonNull
    public Integer getId_dochadzka() {
        return id_dochadzka;
    }

    public void setId_dochadzka(@NonNull Integer id_dochadzka) {
        this.id_dochadzka = id_dochadzka;
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

    @Nullable
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(@Nullable Boolean status) {
        this.status = status;
    }
}
