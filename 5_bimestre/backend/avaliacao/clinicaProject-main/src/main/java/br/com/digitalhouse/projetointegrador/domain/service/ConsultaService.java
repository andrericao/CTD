package br.com.digitalhouse.projetointegrador.domain.service;

import br.com.digitalhouse.projetointegrador.domain.entity.Consulta;

import java.util.List;
import java.util.UUID;

public interface ConsultaService {
    Consulta criarConsulta(Consulta consulta);
    List<Consulta> buscarConsultas();
    Consulta buscarConsultaPorId(UUID id);
    Consulta atualizarConsulta(UUID id, Consulta consulta);
    void deletarConsulta(UUID id);
}
