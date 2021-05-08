package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Objects;

@Data
@NoArgsConstructor
@Setter
public class Doctor {
    private String id;
    private String name;
    private Spec specialist;
    private Integer cabinet;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Doctor(String id, String name, Spec specialist, Integer cabinet, String description, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.specialist = specialist;
        this.cabinet = cabinet;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return id.equals(doctor.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
