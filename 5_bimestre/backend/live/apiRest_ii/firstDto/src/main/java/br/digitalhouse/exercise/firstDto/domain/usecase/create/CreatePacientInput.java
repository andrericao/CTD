package br.digitalhouse.exercise.firstDto.domain.usecase.create;

import br.digitalhouse.exercise.firstDto.domain.entity.Contact;
import br.digitalhouse.exercise.firstDto.domain.entity.GenderEnum;

import java.time.LocalDate;

public record CreatePacientInput(
        String name,
        String lastName,
        String document,
        LocalDate dateOfBirth,
        Contact contact,
        GenderEnum genderEnum){
}
