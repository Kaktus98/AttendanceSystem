package com.finalthesis.AttendanceSystem.domain;

import io.micrometer.common.lang.NonNull;
import io.micrometer.common.lang.Nullable;

import java.util.Objects;

public class Ucitel {

    @Nullable
    private Integer id_ucitel;

    @NonNull
    private String titul;

    @NonNull
    private String meno;

    @NonNull
    private String priezvisko;

    @NonNull
    private String email;

    @NonNull
    private Integer id_predmet;

    @NonNull
    private Integer id_katedra;

    public Ucitel() {}

    public Ucitel(@NonNull String titul, @NonNull String meno, @NonNull String priezvisko, @NonNull String email, @NonNull Integer id_predmet, @NonNull Integer id_katedra) {
        this.titul = titul;
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.email = email;
        this.id_predmet = id_predmet;
        this.id_katedra = id_katedra;
    }

    @Nullable
    public Integer getId_ucitel() {
        return id_ucitel;
    }

    public void setId_ucitel(@Nullable Integer id_ucitel) {
        this.id_ucitel = id_ucitel;
    }

    @NonNull
    public String getTitul() {
        return titul;
    }

    public void setTitul(@NonNull String titul) {
        this.titul = titul;
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
    public String getEmail() {
        return email;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }

    @NonNull
    public Integer getId_predmet() {
        return id_predmet;
    }

    public void setId_predmet(@NonNull Integer id_predmet) {
        this.id_predmet = id_predmet;
    }

    @NonNull
    public Integer getId_katedra() {
        return id_katedra;
    }

    public void setId_katedra(@NonNull Integer id_katedra) {
        this.id_katedra = id_katedra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ucitel ucitel = (Ucitel) o;
        return Objects.equals(id_ucitel, ucitel.id_ucitel) && Objects.equals(titul, ucitel.titul) && Objects.equals(meno, ucitel.meno) && Objects.equals(priezvisko, ucitel.priezvisko) && Objects.equals(email, ucitel.email) && Objects.equals(id_predmet, ucitel.id_predmet) && Objects.equals(id_katedra, ucitel.id_katedra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_ucitel, titul, meno, priezvisko, email, id_predmet, id_katedra);
    }
}
