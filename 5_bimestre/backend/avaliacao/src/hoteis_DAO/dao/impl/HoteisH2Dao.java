package hoteis_DAO.dao.impl;

import hoteis_DAO.dao.ConfigurationJdbc;
import hoteis_DAO.dao.IDao;
import hoteis_DAO.model.Classificacao;
import hoteis_DAO.model.Hoteis;
import hoteis_DAO.model.Classificacao;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class HoteisH2Dao implements IDao<Hoteis> {
    private static final Logger log = Logger.getLogger(HoteisH2Dao.class);
    private static final String SQL_BUSCA_POR_ID = "SELECT * FROM Hoteis WHERE id = ?";
    private static final String SQL_DE_CRIACAO = "INSERT INTO Hoteis VALUES(?, ?, ?, ?, ?, ?, ?)";
    private ConfigurationJdbc configurationJdbc = new ConfigurationJdbc();
    @Override
    public Hoteis buscarPorId(Integer id) {
        log.info("Buscando Hotel por id: " + id);
        Connection connection = configurationJdbc.getConnection();
        try(PreparedStatement statement = connection.prepareStatement(SQL_BUSCA_POR_ID)){
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            Hoteis hoteis = null;

            while(resultSet.next()){
                Integer hotelId = resultSet.getInt(1);
                String hotelNome = resultSet.getString(2);
                String hotelRua = resultSet.getString(3);
                Integer hotelNumero = resultSet.getInt(4);
                String hotelCidade = resultSet.getString(5);
                String hotelEstado = resultSet.getString(6);
                Classificacao classificacao = Classificacao.valueOf(resultSet.getString(7));
                hoteis = new Hoteis(hotelId, hotelNome, hotelRua, hotelNumero, hotelCidade, hotelEstado, classificacao);
            }
            statement.close();
            log.info("Registro de hotel: " + hoteis);
            return hoteis;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Hoteis criar(Hoteis entidade) {
        log.info("Criando hotel: " + entidade);
        Connection connection = configurationJdbc.getConnection();
        try(PreparedStatement statement = connection.prepareStatement(SQL_DE_CRIACAO)){
            statement.setInt(1,entidade.getId());
            statement.setString(2,entidade.getNome());
            statement.setString(3, entidade.getRua());
            statement.setInt(4, entidade.getNumero());
            statement.setString(5, entidade.getCidade());
            statement.setString(6, entidade.getEstado());
            statement.setString(7,entidade.getClassificacao().name());
            statement.execute();
        } catch (Exception e){
            e.printStackTrace();
            return null;

        }
        return entidade;
    }

    @Override
    public void exclui(Integer id) {

    }

    @Override
    public List<Hoteis> buscarTodos() {
        return null;
    }
}
