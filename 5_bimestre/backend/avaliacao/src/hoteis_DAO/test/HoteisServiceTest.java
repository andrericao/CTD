package hoteis_DAO.test;

import hoteis_DAO.dao.IDao;
import hoteis_DAO.dao.impl.HoteisH2Dao;
import hoteis_DAO.model.Classificacao;
import hoteis_DAO.model.Hoteis;
import hoteis_DAO.model.Classificacao;
import hoteis_DAO.service.HoteisService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class HoteisServiceTest {
    private HoteisService hoteisService;
    @Test
    void criacao(){
        IDao<Hoteis> hoteisIDao = new HoteisH2Dao();

        Hoteis hotel1 = new Hoteis(1, "4Season", "Avenida X", 500, "Las Vegas", "DF", Classificacao.CINCO_ESTRELAS);
        hoteisIDao.criar(hotel1);


        Hoteis hotel2 = new Hoteis(2, "Bellagio", "Rua da quitanda", 21, "Niterói", "RJ", Classificacao.TRES_ESTRELAS);
        hoteisIDao.criar(hotel2);


        Hoteis hotel3 = new Hoteis(3, "St. Regis Bal Harbour Resort", "Rua sem saída", 22, "Cidade do México", "MX", Classificacao.QUATRO_ESTRELAS);
        hoteisIDao.criar(hotel3);


        Hoteis hotel4 = new Hoteis(4, "5LETRAS", "Avenida YZ", 22, "Tókio", "JP", Classificacao.UMA_ESTRELA);
        hoteisIDao.criar(hotel4);


        Hoteis hotel5 = new Hoteis(5, "Champion", "BR301", 22, "Paris", "FR", Classificacao.QUATRO_ESTRELAS);
        hoteisIDao.criar(hotel5);

        hoteisService = new HoteisService(hoteisIDao);
    }

    @Test
    void criarRegistroH2(){
        Hoteis hoteis = new Hoteis(4, "Champion", "Avenida Brasil", 1531, "Pernambuco", "PE", Classificacao.DUAS_ESTRELAS);

        IDao<Hoteis> daoHoteis = new HoteisH2Dao();
        HoteisService h2Service = new HoteisService(daoHoteis);
        h2Service.criarHotel(hoteis);

        Hoteis hotelEncontrado = h2Service.buscarPorId(hoteis.getId());

        Assertions.assertNotNull(hotelEncontrado);
    }

}
