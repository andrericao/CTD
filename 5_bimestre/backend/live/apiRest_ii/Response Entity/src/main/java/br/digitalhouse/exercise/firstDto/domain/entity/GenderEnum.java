package br.digitalhouse.exercise.firstDto.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GenderEnum {
    M("Masculino"),
    F("Feminino");

    private final String name;
}
