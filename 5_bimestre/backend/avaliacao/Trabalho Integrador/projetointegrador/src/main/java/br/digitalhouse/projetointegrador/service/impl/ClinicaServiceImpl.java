package br.digitalhouse.projetointegrador.service.impl;

import br.digitalhouse.projetointegrador.dao.IDao;
import br.digitalhouse.projetointegrador.model.Clinica;
import br.digitalhouse.projetointegrador.service.ClinicaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClinicaServiceImpl implements ClinicaService {
    private final IDao<Clinica> clinicaIDao;
    public ClinicaServiceImpl(IDao<Clinica> clinicaIDao){
        this.clinicaIDao = clinicaIDao;
    }

    @Override
    public Clinica criarClinica(Clinica clinica){
        return clinicaIDao.criar(clinica);
    }
    @Override
    public Clinica buscarClinicaPorId(Integer id){
        return clinicaIDao.buscarPorId(id).orElseThrow(IllegalAccessError::new);
    }

    @Override
    public List<Clinica> buscarTodasClinicas(){
        return clinicaIDao.buscarTodos();
    }

    @Override
    public Clinica atualizarClinica(Clinica clinica){
        return clinicaIDao.atualizar(clinica);
    }

    @Override
    public void excluirClinica(Integer id){
        clinicaIDao.excluir(id);
    }

}
