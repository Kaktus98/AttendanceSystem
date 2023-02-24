package com.finalthesis.AttendanceSystem.domain;

import io.micrometer.common.lang.NonNull;
import io.micrometer.common.lang.Nullable;

import java.util.Objects;

public class Student {

    @Nullable
    private Integer id;

    @NonNull
    private String meno;

    @NonNull
    private String priezvisko;

    @NonNull
    private String email;

    @NonNull
    private Integer id_predmet;

    @NonNull
    private Integer id_dochadzka;

    @NonNull
    private Integer id_rocnik;

    public Student() {}

    public Student(@NonNull String meno, @NonNull String priezvisko, @NonNull String email, @NonNull Integer id_predmet, @NonNull Integer id_dochadzka, @NonNull Integer id_rocnik) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.email = email;
        this.id_predmet = id_predmet;
        this.id_dochadzka = id_dochadzka;
        this.id_rocnik = id_rocnik;
    }

    @Nullable
    public Integer getId() {
        return id;
    }

    public void setId(@Nullable Integer id) {
        this.id = id;
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
    public Integer getId_dochadzka() {
        return id_dochadzka;
    }

    public void setId_dochadzka(@NonNull Integer id_dochadzka) {
        this.id_dochadzka = id_dochadzka;
    }

    @NonNull
    public Integer getId_rocnik() {
        return id_rocnik;
    }

    public void setId_rocnik(@NonNull Integer id_rocnik) {
        this.id_rocnik = id_rocnik;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(meno, student.meno) && Objects.equals(priezvisko, student.priezvisko) && Objects.equals(email, student.email) && Objects.equals(id_predmet, student.id_predmet) && Objects.equals(id_dochadzka, student.id_dochadzka) && Objects.equals(id_rocnik, student.id_rocnik);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, meno, priezvisko, email, id_predmet, id_dochadzka, id_rocnik);
    }
}
