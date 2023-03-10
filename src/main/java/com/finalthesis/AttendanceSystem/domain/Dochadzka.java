package com.finalthesis.AttendanceSystem.domain;

import io.micrometer.common.lang.NonNull;
import io.micrometer.common.lang.Nullable;

import java.util.Objects;

public class Dochadzka {

    @Nullable
    private Integer id_dochadzka;

    @Nullable
    private Boolean status;

    @NonNull
    private Integer id_predmet;

    @NonNull
    private Integer id_student;

    public Dochadzka() {}

    public Dochadzka(@Nullable Boolean status, @NonNull Integer id_predmet, @NonNull Integer id_student) {
        this.status = status;
        this.id_predmet = id_predmet;
        this.id_student = id_student;
    }

    @Nullable
    public Integer getId_dochadzka() {
        return id_dochadzka;
    }

    public void setId_dochadzka(@Nullable Integer id_dochadzka) {
        this.id_dochadzka = id_dochadzka;
    }

    @Nullable
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(@Nullable Boolean status) {
        this.status = status;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dochadzka dochadzka = (Dochadzka) o;
        return Objects.equals(id_dochadzka, dochadzka.id_dochadzka) && Objects.equals(status, dochadzka.status) && Objects.equals(id_predmet, dochadzka.id_predmet) && Objects.equals(id_student, dochadzka.id_student);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_dochadzka, status, id_predmet, id_student);
    }
}
