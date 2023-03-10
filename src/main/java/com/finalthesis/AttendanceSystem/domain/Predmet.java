package com.finalthesis.AttendanceSystem.domain;

import io.micrometer.common.lang.NonNull;
import io.micrometer.common.lang.Nullable;

import java.util.Objects;

public class Predmet {

    @Nullable
    private Integer id_predmet;

    @NonNull
    private String nazov_predmetu;

    @NonNull
    private String skupina;

    @NonNull
    private String ucebna;

    @NonNull
    private String den;

    @NonNull
    private String cas;

    @NonNull
    private Integer id_ucitel;

    public Predmet() {}

    public Predmet(@Nullable Integer id_predmet, @NonNull String nazov_predmetu, @NonNull String skupina, @NonNull String ucebna, @NonNull String den, @NonNull String cas, @NonNull Integer id_ucitel) {
        this.id_predmet = id_predmet;
        this.nazov_predmetu = nazov_predmetu;
        this.skupina = skupina;
        this.ucebna = ucebna;
        this.den = den;
        this.cas = cas;
        this.id_ucitel = id_ucitel;
    }

    @Nullable
    public Integer getId_predmet() {
        return id_predmet;
    }

    public void setId_predmet(@Nullable Integer id_predmet) {
        this.id_predmet = id_predmet;
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
    public String getDen() {
        return den;
    }

    public void setDen(@NonNull String den) {
        this.den = den;
    }

    @NonNull
    public String getCas() {
        return cas;
    }

    public void setCas(@NonNull String cas) {
        this.cas = cas;
    }

    @NonNull
    public Integer getId_ucitel() {
        return id_ucitel;
    }

    public void setId_ucitel(@NonNull Integer id_ucitel) {
        this.id_ucitel = id_ucitel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predmet predmet = (Predmet) o;
        return Objects.equals(id_predmet, predmet.id_predmet) && Objects.equals(nazov_predmetu, predmet.nazov_predmetu) && Objects.equals(skupina, predmet.skupina) && Objects.equals(ucebna, predmet.ucebna) && Objects.equals(den, predmet.den) && Objects.equals(cas, predmet.cas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_predmet, nazov_predmetu, skupina, ucebna, den, cas);
    }
}
