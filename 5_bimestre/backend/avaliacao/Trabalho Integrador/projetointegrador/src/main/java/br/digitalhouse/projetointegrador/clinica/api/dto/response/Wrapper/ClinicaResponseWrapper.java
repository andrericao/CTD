package br.digitalhouse.projetointegrador.clinica.api.dto.response.Wrapper;

import br.digitalhouse.projetointegrador.clinica.api.dto.response.List.ClinicaListResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ClinicaResponseWrapper {
    private List<ClinicaListResponse> clinicas;

    public void setClinicas(List<ClinicaListResponse> list) {
    }
}