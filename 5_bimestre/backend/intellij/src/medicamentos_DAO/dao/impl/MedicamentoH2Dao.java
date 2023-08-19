package medicamentos_DAO.dao.impl;

import medicamentos_DAO.dao.ConfigurationJdbc;
import medicamentos_DAO.dao.IDao;
import medicamentos_DAO.model.Medicamentos;
import medicamentos_DAO.model.TipoLaboratorio;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class MedicamentoH2Dao implements IDao<Medicamentos> {
    private static final Logger log = Logger.getLogger(MedicamentoH2Dao.class);
    private static final String SQL_BUSCA_POR_ID = "SELECT * FROM Medicamentos WHERE id = ?";
    private static final String SQL_DE_CRIACAO = "INSERT INTO Medicamentos VALUES(?, ?, ?, ?, ?)";
    private ConfigurationJdbc configurationJdbc = new ConfigurationJdbc();
    @Override
    public Medicamentos buscarPorId(Integer id) {
        log.info("[h2] Buscando Medicamento por id: " + id);
        Connection connection = configurationJdbc.getConnection();
        try(PreparedStatement statement = connection.prepareStatement(SQL_BUSCA_POR_ID)){
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            Medicamentos medicamentos = null;

            while(resultSet.next()){
                Integer medicamentoId = resultSet.getInt(1);
                String medicamentoNome = resultSet.getString(2);
                TipoLaboratorio laboratorio = TipoLaboratorio.valueOf(resultSet.getString(3));
                Integer quantidade = resultSet.getInt(4);
                Double preco = resultSet.getDouble(5);
                medicamentos = new Medicamentos(medicamentoId, medicamentoNome, laboratorio, quantidade, preco);
            }
            statement.close();
            log.info("[h2] Registro encontrado: " + medicamentos);
            return medicamentos;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Medicamentos criar(Medicamentos entidade) {
        log.info("[h2] Criando entidade: " + entidade);
        Connection connection = configurationJdbc.getConnection();
        try(PreparedStatement statement = connection.prepareStatement(SQL_DE_CRIACAO)){
            statement.setInt(1,entidade.getId());
            statement.setString(2,entidade.getNome());
            statement.setString(3,entidade.getLaboratorio().name());
            statement.setInt(4,entidade.getQuantidade());
            statement.setDouble(5,entidade.getPreco());
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
    public List<Medicamentos> buscarTodos() {
        return null;
    }
}
