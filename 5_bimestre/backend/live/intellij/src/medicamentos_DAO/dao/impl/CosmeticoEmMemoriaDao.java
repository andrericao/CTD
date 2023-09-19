package medicamentos_DAO.dao.impl;

import medicamentos_DAO.dao.IDao;
import medicamentos_DAO.model.Cosmeticos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CosmeticoEmMemoriaDao implements IDao<Cosmeticos> {
    private final Map<Integer, Cosmeticos> cosmeticosEmMemoria = new HashMap<>();

    @Override
    public Cosmeticos buscarPorId(Integer is) {
        return null;
    }

    @Override
    public Cosmeticos criar(Cosmeticos entidade) {
        return null;
    }

    @Override
    public void exclui(Integer id) {

    }

    @Override
    public List<Cosmeticos> buscarTodos() {
        return null;
    }
}
