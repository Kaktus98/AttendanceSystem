package com.finalthesis.AttendanceSystem.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.micrometer.common.lang.NonNull;

public class Validation {

    @NonNull
    @JsonProperty("uuidCode")
    private String uuidCode;

    @NonNull
    @JsonProperty("id_student")
    private Integer id_student;

    public Validation(@NonNull String uuidCode, @NonNull Integer id_student) {
        this.uuidCode = uuidCode;
        this.id_student = id_student;
    }

    @NonNull
    public String getUuidCode() {
        return uuidCode;
    }

    public void setUuidCode(@NonNull String uuidCode) {
        this.uuidCode = uuidCode;
    }

    @NonNull
    public Integer getId_student() {
        return id_student;
    }

    public void setId_student(@NonNull Integer id_student) {
        this.id_student = id_student;
    }
}
