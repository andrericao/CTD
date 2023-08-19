package medicamentos_DAO.dao.impl;

import medicamentos_DAO.dao.IDao;
import medicamentos_DAO.model.Medicamentos;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MedicamentosEmMemoriaDao implements IDao<Medicamentos> {

    Logger log = Logger.getLogger(MedicamentosEmMemoriaDao.class);
    private final Map<Integer, Medicamentos> medicamentosEmMemoria = new HashMap<>();
    @Override
    public Medicamentos buscarPorId(Integer id) {
        log.info("[Em memória]: Buscando medicamento por id: " + id);
        return medicamentosEmMemoria.get(id);
    }

    @Override
    public Medicamentos criar(Medicamentos entidade) {
        log.info("[Em memória]: Criando medicamento " + entidade);
        medicamentosEmMemoria.put(entidade.getId(), entidade);
        return entidade;
    }

    @Override
    public void exclui(Integer id) {
        log.info("[Em memória]: Excluindo medicamento por id: " + id);
        medicamentosEmMemoria.remove(id);
    }

    @Override
    public List<Medicamentos> buscarTodos() {
        log.info("[Em memória]: Buscando todos os medicamentos");
        return medicamentosEmMemoria.values().stream().toList();
    }
}
