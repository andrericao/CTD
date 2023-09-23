package br.digitalhouse.projetointegrador.service;

import br.digitalhouse.projetointegrador.model.Clinica;

import java.util.List;

public interface ClinicaService {
    Clinica criarClinica(Clinica clinica);
    Clinica buscarClinicaPorId(Integer id);
    List<Clinica> buscarTodasClinicas();
    Clinica atualizarClinica(Clinica clinica);

    void excluirClinica(Integer id);
}
