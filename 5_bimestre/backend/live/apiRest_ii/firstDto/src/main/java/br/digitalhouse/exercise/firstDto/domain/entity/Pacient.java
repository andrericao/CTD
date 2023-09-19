package br.digitalhouse.exercise.firstDto.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class Pacient {
    private Integer id;
    private String name;
    private String lastName;
    private String docment;
    private LocalDate dateOfBirth;
    private Contact contact;
    private Gender gender;

}
