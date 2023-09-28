package br.digitalhouse.projetointegrador.service;

import br.digitalhouse.projetointegrador.model.Clinica;

import java.util.List;
import java.util.UUID;

public interface ClinicaService {
    Clinica criarClinica(Clinica clinica);
    Clinica buscarClinicaPorId(UUID id);
    List<Clinica> buscarTodasClinicas();
    Clinica atualizarClinica(Clinica clinica);
    void excluirClinica(UUID id);
}
