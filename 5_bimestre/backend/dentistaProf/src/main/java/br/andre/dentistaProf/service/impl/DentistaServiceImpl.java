package br.andre.dentistaProf.service.impl;

import br.andre.dentistaProf.service.DentistaService;
import br.andre.dentistaProf.dao.IDao;
import br.andre.dentistaProf.model.Dentista;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DentistaServiceImpl implements DentistaService {
    private final IDao<Dentista> dentistaIDao;

    public DentistaServiceImpl(IDao<Dentista> dentistaIDao) {
        this.dentistaIDao = dentistaIDao;
    }

    @Override
    public Dentista criarDentista(Dentista dentista) {
        return dentistaIDao.criar(dentista);
    }

    @Override
    public Dentista buscarDentistaPorId(Integer id) {
        return dentistaIDao.buscarPorId(id).orElseThrow(IllegalStateException::new);
    }

    @Override
    public List<Dentista> buscarTodosOsDentistas() {
        return dentistaIDao.buscarTodos();
    }

    @Override
    public Dentista atualizarDentista(Dentista dentista) {
        return dentistaIDao.atualizar(dentista);
    }

    @Override
    public void excluirDentista(Integer id) {
        dentistaIDao.excluir(id);
    }
}
