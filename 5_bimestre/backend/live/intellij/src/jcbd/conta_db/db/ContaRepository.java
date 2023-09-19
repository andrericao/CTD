package jcbd.conta_db.db;

import jcbd.conta_db.model.Conta;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ContaRepository {
    private static final Logger log = Logger.getLogger(ContaRepository.class);
    private static final String SQL_BUSCA_POR_ID = "SELECT * FROM CONTA WHERE id = ?";
    private static final String SQL_DELETE_POR_ID = "DELETE FROM CONTA WHERE id = ?";
    private static final String SQL_DE_CRIACAO = """
            INSERT INTO Conta(id, nome, numero, saldo)
            VALUES(?, ?, ?, ?);
        """;
    private final Connection connection;

    public ContaRepository() throws Exception {
            this.connection = ConfigurationConnection.getConnection();
    }

    public Conta buscaContaPorId(String id){
        log.info("Buscando conta por Id: " + id);
        try(PreparedStatement preparedStatement =
                    connection.prepareStatement(SQL_BUSCA_POR_ID)){
            preparedStatement.setString(1, id);
            log.info("Executando SELECT por id");
            ResultSet resultSet = preparedStatement.executeQuery();
            Conta conta = null;
            log.info("Lendo resultado encontrado");
            while(resultSet.next()){
                conta = new Conta(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getInt(4));
            }
            return conta;
        } catch(Exception e){
            log.error(e);
            return null;
        }
    }

    public void excluiContaPorId(String id){
        log.info("Excluindo conta por Id: " + id);
        try(PreparedStatement preparedStatement =
                    connection.prepareStatement(SQL_DELETE_POR_ID)){
            preparedStatement.setString(1, id);
            log.info("Executando DELETE por id");
            preparedStatement.executeUpdate();
        } catch(Exception e){
            log.error(e);
        }
    }

    public Conta criarConta(Conta conta){
        log.info("Criando conta");
        try(PreparedStatement preparedStatement =
                    connection.prepareStatement(SQL_DE_CRIACAO)){
            preparedStatement.setString(1, conta.getId());
            preparedStatement.setString(2, conta.getNome());
            preparedStatement.setString(3, conta.getNumeroConta());
            preparedStatement.setInt(4, conta.getSaldo());
            log.info("Conta criada com os seguintes valores: \nid: %s | nome: %s | numero: %s | saldo: %d"
                    .formatted(conta.getId(), conta.getNome(), conta.getNumeroConta(), conta.getSaldo()));
            preparedStatement.executeUpdate();
            return conta;
        } catch(Exception e){
            log.error(e);
            return null;
        }
    }
}
