package br.digitalhouse.exercise.firstDto.domain.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PacientTest {

    @Test
    void testNewPacient(){
        String expectedName = "André";
        String expectedLastName = "Paulo";
        String expectedDocument = "100.200.300-40";
        String expectedEmail = "andrepaulo@digitalhouse.com";
        String expectedPhone = "(85) 8665-5000";
        Contact expectedContact = new Contact(expectedPhone, expectedEmail);
        LocalDate expectedDateOfBirth = LocalDate.of(1990, 12, 05);
        GenderEnum expectedGender = GenderEnum.M;

        Pacient createdPacient = Pacient.newPacient(
                expectedName,
                expectedLastName,
                expectedDocument,
                expectedDateOfBirth,
                expectedContact,
                expectedGender
        );

        Assertions.assertNotNull(createdPacient);
        Assertions.assertEquals(expectedName, createdPacient.getName());
        Assertions.assertEquals(expectedLastName, createdPacient.getLastName());
        Assertions.assertEquals(expectedDocument, createdPacient.getDocument());
        Assertions.assertEquals(expectedDateOfBirth, createdPacient.getDateOfBirth());
        Assertions.assertEquals(expectedContact, createdPacient.getContact());
        Assertions.assertEquals(expectedGender, createdPacient.getGender());
    }

    @Test
    void testNewPacientError(){
        String expectedName = "André";
        String expectedLastName = "Paulo";
        String expectedDocument = "100.200.300-40";
        String expectedEmail = "andrepaulo@digitalhouse.com";
        String expectedPhone = "(85) 8665-5000";
        Contact expectedContact = new Contact(expectedPhone, expectedEmail);
        LocalDate expectedDateOfBirth = LocalDate.of(1990, 12, 05);
        GenderEnum expectedGender = GenderEnum.M;

        IllegalArgumentException exception = Assertions.assertThrows(
                IllegalArgumentException.class, () ->
                Pacient.newPacient(
                        null,
                        expectedLastName,
                        expectedDocument,
                        expectedDateOfBirth,
                        expectedContact,
                        expectedGender));
        Assertions.assertNotNull(exception);
    }
}