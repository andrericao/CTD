package hoteis_DAO.service;

import hoteis_DAO.dao.IDao;
import hoteis_DAO.model.Hoteis;

import java.util.List;

public class HoteisService {
    private final IDao<Hoteis> daoHoteis;

    public HoteisService(IDao<Hoteis> daoHoteis) {
        this.daoHoteis = daoHoteis;
    }

    public Hoteis criarHotel(Hoteis hoteis){
        return daoHoteis.criar(hoteis);
   }

    public void excluirHotel(Integer id){
        daoHoteis.exclui(id);
    }

    public List<Hoteis> buscarTodos(){
        return daoHoteis.buscarTodos();
    }

    public Hoteis buscarPorId(Integer id) {
       return daoHoteis.buscarPorId(id);
    }
}
