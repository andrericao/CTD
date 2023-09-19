package medicamentos_DAO.service;

import medicamentos_DAO.dao.IDao;
import medicamentos_DAO.model.Medicamentos;

import java.util.List;

public class MedicamentoService {
    private final IDao<Medicamentos> daoMedicamentos;

    public MedicamentoService(IDao<Medicamentos> daoMedicamentos) {
        this.daoMedicamentos = daoMedicamentos;
    }

    public Medicamentos criarMedicamneto(Medicamentos medicamentos){
        //todo: validações que checam até se os medicamentos são comercializados no Brasil, anvisa
        return daoMedicamentos.criar(medicamentos);
   }

    public void excluirMedicamento(Integer id){
        daoMedicamentos.exclui(id);
    }

    public List<Medicamentos> buscarTodos(){
        return daoMedicamentos.buscarTodos();
    }

    public Medicamentos buscarPorId(Integer id) {
       return daoMedicamentos.buscarPorId(id);
    }
}
