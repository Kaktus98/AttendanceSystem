package com.finalthesis.AttendanceSystem.domain;

import io.micrometer.common.lang.NonNull;
import io.micrometer.common.lang.Nullable;

import java.util.Date;
import java.util.Objects;

public class Predmet {

    @Nullable
    private Integer id;

    @NonNull
    private String nazov_predmetu;

    @NonNull
    private String skupina;

    @NonNull
    private String ucebna;

    @NonNull
    private Date datum;

    @NonNull
    private String cas;

    public Predmet() {}

    public Predmet(@NonNull String nazov_predmetu, @NonNull String skupina, @NonNull String ucebna, @NonNull Date datum, @NonNull String cas) {
        this.nazov_predmetu = nazov_predmetu;
        this.skupina = skupina;
        this.ucebna = ucebna;
        this.datum = datum;
        this.cas = cas;
    }

    @Nullable
    public Integer getId() {
        return id;
    }

    public void setId(@Nullable Integer id) {
        this.id = id;
    }

    @NonNull
    public String getNazov_predmetu() {
        return nazov_predmetu;
    }

    public void setNazov_predmetu(@NonNull String nazov_predmetu) {
        this.nazov_predmetu = nazov_predmetu;
    }

    @NonNull
    public String getSkupina() {
        return skupina;
    }

    public void setSkupina(@NonNull String skupina) {
        this.skupina = skupina;
    }

    @NonNull
    public String getUcebna() {
        return ucebna;
    }

    public void setUcebna(@NonNull String ucebna) {
        this.ucebna = ucebna;
    }

    @NonNull
    public Date getDatum() {
        return datum;
    }

    public void setDatum(@NonNull Date datum) {
        this.datum = datum;
    }

    @NonNull
    public String getCas() {
        return cas;
    }

    public void setCas(@NonNull String cas) {
        this.cas = cas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predmet predmet = (Predmet) o;
        return Objects.equals(id, predmet.id) && Objects.equals(nazov_predmetu, predmet.nazov_predmetu) && Objects.equals(skupina, predmet.skupina) && Objects.equals(ucebna, predmet.ucebna) && Objects.equals(datum, predmet.datum) && Objects.equals(cas, predmet.cas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nazov_predmetu, skupina, ucebna, datum, cas);
    }
}
