package br.digitalhouse.exercise.firstDto.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
public class Pacient {
    private UUID id;
    private String name;
    private String lastName;
    private String document;
    private LocalDate dateOfBirth;
    private Contact contact;
    private GenderEnum gender;

    private Pacient(
            UUID id,
            String name,
            String lastName,
            String document,
            LocalDate dateOfBirth,
            Contact contact,
            GenderEnum gender) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.document = document;
        this.dateOfBirth = dateOfBirth;
        this.contact = contact;
        this.gender = gender;
        validate();
    }

    public static Pacient newPacient(
            String name,
            String lastName,
            String document,
            LocalDate dateOfBirth,
            Contact contact,
            GenderEnum gender){
        UUID idPacient  = UUID.randomUUID();
        return new Pacient(idPacient, name, lastName, document, dateOfBirth, contact, gender);
    }

    private void validate(){
        if(name == null){
            throw new IllegalArgumentException("'name' not given!");
        }
        if(dateOfBirth.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("'dateOfBirth' must be bigger than today");
        }
        if(contact == null){
            throw new IllegalArgumentException("'contact' incorrect!");
        }
        if(contact.getPhone() == null && contact.getPhone() == null){
            throw new IllegalArgumentException("'contact' incorrect!");
        }
    }

}
