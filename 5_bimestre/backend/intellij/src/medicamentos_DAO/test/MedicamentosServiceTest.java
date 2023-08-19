package medicamentos_DAO.test;

import medicamentos_DAO.dao.IDao;
import medicamentos_DAO.dao.impl.MedicamentoH2Dao;
import medicamentos_DAO.dao.impl.MedicamentosEmMemoriaDao;
import medicamentos_DAO.model.Medicamentos;
import medicamentos_DAO.model.TipoLaboratorio;
import medicamentos_DAO.service.MedicamentoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MedicamentosServiceTest {
    private MedicamentoService medicamentoService;

    @BeforeEach
    void setup(){
        IDao<Medicamentos> medicamentosIDao = new MedicamentosEmMemoriaDao();

        Medicamentos medicamentos1 = new Medicamentos(1, "Cimegrip", TipoLaboratorio.CIMED, 10, 19.9);
        medicamentosIDao.criar(medicamentos1);


        Medicamentos medicamentos2 = new Medicamentos(2, "Dipirona", TipoLaboratorio.EMS, 12, 129.9);
        medicamentosIDao.criar(medicamentos2);


        Medicamentos medicamentos3 = new Medicamentos(3, "Aerolim", TipoLaboratorio.INSTITUTO_BRASILEIRO, 0, 11.9);
        medicamentosIDao.criar(medicamentos3);


        Medicamentos medicamentos4 = new Medicamentos(4, "Ibuprofeno", TipoLaboratorio.CIMED, 30, 10.9);
        medicamentosIDao.criar(medicamentos4);

        medicamentoService = new MedicamentoService(medicamentosIDao);
    }

    @Test
    void buscarTodosMedicamentos(){
        List<Medicamentos> medicamentosEncontrados = medicamentoService.buscarTodos();

        Assertions.assertEquals(4, medicamentosEncontrados.size());
    }

    @Test
    void adicionarUmRegistroAMais(){
        Medicamentos medicamentos = new Medicamentos(5, "Finasterida", TipoLaboratorio.INSTITUTO_BRASILEIRO, 2, 190.40);

        medicamentoService.criarMedicamneto(medicamentos);
        List<Medicamentos> medicamentosEncontrados = medicamentoService.buscarTodos();

        Assertions.assertEquals(4, medicamentosEncontrados.size());
    }

    @Test
    void criarRegistroH2(){
        Medicamentos medicamentos = new Medicamentos(5, "Finasterida", TipoLaboratorio.INSTITUTO_BRASILEIRO, 2, 190.40);

        IDao<Medicamentos> daoMedicamentos = new MedicamentoH2Dao();
        MedicamentoService h2Service = new MedicamentoService(daoMedicamentos);
        h2Service.criarMedicamneto(medicamentos);

        Medicamentos medicamentosEncontrado = h2Service.buscarPorId(medicamentos.getId());

        Assertions.assertNotNull(medicamentosEncontrado);
    }

}
