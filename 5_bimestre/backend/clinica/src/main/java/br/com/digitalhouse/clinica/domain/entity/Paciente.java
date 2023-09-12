package br.com.digitalhouse.clinica.domain.entity;
import lombok.Getter;

import java.time.LocalDate;
import java.util.UUID;


@Getter
public class Paciente {
    private UUID id;
    private String nome;
    private String sobreNome;
    private String documento;
    private LocalDate dataNascimento;
    private Contato contato;
    private GeneroEnum genero;

    public static  Paciente novoPaciente(
            UUID id,
            String nome,
            String sobreNome,
            String documento,
            LocalDate dataNascimento,
            Contato contato,
            GeneroEnum genero){
        UUID idPaciente = UUID.randomUUID();
        return new Paciente(idPaciente, )

    }

}
