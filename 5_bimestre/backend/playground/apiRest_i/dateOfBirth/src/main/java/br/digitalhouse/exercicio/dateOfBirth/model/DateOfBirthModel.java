package br.digitalhouse.exercicio.dateOfBirth.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DateOfBirthModel {
    private Integer day;
    private Integer month;
    private Integer year;
}
