package medicamentos_DAO.test;

import medicamentos_DAO.dao.IDao;
import medicamentos_DAO.dao.impl.MedicamentoH2Dao;
import medicamentos_DAO.model.Medicamentos;
import medicamentos_DAO.model.TipoLaboratorio;
import medicamentos_DAO.service.MedicamentoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MedicamentosServiceH2Test {

    private final IDao<Medicamentos> daoMedicamentos = new MedicamentoH2Dao();
    private final MedicamentoService h2Service = new MedicamentoService(daoMedicamentos);

    @Test
    void criarRegistroH2(){
        Medicamentos medicamentos = new Medicamentos(5, "Finasterida", TipoLaboratorio.INSTITUTO_BRASILEIRO, 2, 190.40);

        h2Service.criarMedicamneto(medicamentos);

        Medicamentos medicamentosEncontrado = h2Service.buscarPorId(medicamentos.getId());

        Assertions.assertNotNull(medicamentosEncontrado);
    }
}
