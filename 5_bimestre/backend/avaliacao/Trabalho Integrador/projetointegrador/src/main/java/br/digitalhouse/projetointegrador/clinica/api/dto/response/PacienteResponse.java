package br.digitalhouse.projetointegrador.clinica.api.dto.response;

import br.digitalhouse.projetointegrador.clinica.domain.entity.SexoEnum;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class PacienteResponse {

    private UUID id;
    private String nome;
    private LocalDate dataNascimento;
    private SexoEnum sexo;
    private LocalDateTime createdAt;
    private LocalDateTime updateAt;
    private EnderecoResponse endereco;
    private ContatoResponse contato;

}
