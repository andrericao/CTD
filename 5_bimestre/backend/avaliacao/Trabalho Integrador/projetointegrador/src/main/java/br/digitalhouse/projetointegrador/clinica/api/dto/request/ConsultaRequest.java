package br.digitalhouse.projetointegrador.clinica.api.dto.request;

import br.digitalhouse.projetointegrador.clinica.domain.entity.Clinica;
import br.digitalhouse.projetointegrador.clinica.domain.entity.Paciente;
import br.digitalhouse.projetointegrador.clinica.domain.entity.Dentista;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ConsultaRequest {

    @NotNull
    private Paciente paciente;
    @NotNull
    private Dentista dentista;
    @NotNull
    private Clinica clinica;
    @NotNull
    private LocalDate dataConsulta;
    @NotEmpty
    private String descricao;
    @NotNull
    private Boolean cancelada;
    private String motivoCancelamento;

}
