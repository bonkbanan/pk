package com.example.demo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Data
@NoArgsConstructor
public class Chekup {
    private String id;
    private String name;
    private Patient patient;
    private Doctor doctor;
    private LocalDate date;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chekup chekup = (Chekup) o;
        return id.equals(chekup.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
