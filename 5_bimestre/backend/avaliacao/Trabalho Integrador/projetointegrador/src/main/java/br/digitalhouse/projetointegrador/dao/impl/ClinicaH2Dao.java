package br.digitalhouse.projetointegrador.dao.impl;

import br.digitalhouse.projetointegrador.dao.ConfiguracaoJDBC;
import br.digitalhouse.projetointegrador.dao.IDao;
import br.digitalhouse.projetointegrador.model.Clinica;
import br.digitalhouse.projetointegrador.model.Contato;
import br.digitalhouse.projetointegrador.model.Endereco;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.*;

@Slf4j
@Repository
public class ClinicaH2Dao implements IDao<Clinica> {

    private static final String SQL_CRIACAO_CLINICA = """
            INSERT INTO Clinica(nome, cnpj, razaoSocial, descricao, endereco, contato)
            VALUES (?, ?, ?, ?, ?, ?);
            """;

    private static final String SQL_BUSCAR_CLINICA_POR_ID = """
            SELECT c.id, c.nome, c.razaoSocial, c.descricao, c.endereco, c.contato 
            FROM Clinica c WHERE c.id = ? 
            """;

    private static final String SQL_BUSCAR_TODOS = """
            SELECT c.id, c.nome, c.razaoSocial, c.descricao, c.endereco, c.contato 
            FROM Clinica c
            """;

    private static final String SQL_EXCLUIR = """
            DELETE FROM Clinica WHERE id = ?
            """;


    private static final String SQL_ATUALIZAR_CLINICA = """
            UPDATE Clinica SET nome = ?, cnpj = ?, razaoSocial = ?, descricao = ?, endereco = ?, contato = ? WHERE id = ?
            """;

    private final ConfiguracaoJDBC configuracaoJDBC = new ConfiguracaoJDBC();

    @Override
    public Clinica criar(Clinica clinica){
        log.info("Conectando com o banco de dados");
        Connection connection = configuracaoJDBC.getConnection();
        log.info("Conexão bem sucedida!");

        try (PreparedStatement statement = connection.prepareStatement
                (SQL_CRIACAO_CLINICA, Statement.RETURN_GENERATED_KEYS)){
            statement.setString(1, clinica.getNome());
            statement.setString(2, clinica.getCnpj());
            statement.setString(3, clinica.getRazaoSocial());
            statement.setString(4, clinica.getDescricao());
            statement.setObject(5, clinica.getEndereco());
            statement.setObject(6, clinica.getContato());

            ResultSet resultado = statement.getGeneratedKeys();

            while(resultado.next()) clinica.setId((UUID) resultado.getObject(1));
            log.info("Foi registrado com o ID " + clinica.getId());
            return clinica;

        } catch (Exception e){
            log.info("A criação deu ruim");
            return null;
        }
    }

    @Override
    public Optional<Clinica> buscarPorId(UUID id){

        Connection connection = configuracaoJDBC.getConnection();

        try(PreparedStatement statement = connection.prepareStatement(SQL_BUSCAR_CLINICA_POR_ID)){
            statement.setObject(1, id);
            ResultSet resultSet = statement.executeQuery();
            Clinica clinica = null;

            while(resultSet.next()){
                clinica = this.getClinicaByResultSet(resultSet);
            }
            return Optional.ofNullable(clinica);
        } catch (Exception e){
            return Optional.empty();
        }
    }

    @Override
    public List<Clinica> buscarTodos(){

        Connection connection = configuracaoJDBC.getConnection();
        try(Statement statement = connection.createStatement()){
            ResultSet resultSet = statement.executeQuery(SQL_BUSCAR_TODOS);

            List<Clinica> clinicas = new ArrayList<>();
            while(resultSet.next()){
                Clinica clinica = getClinicaByResultSet(resultSet);
                clinicas.add(clinica);
            }
            return clinicas;
        } catch (Exception e){
            return Collections.emptyList();
        }
    }

    @Override
    public Clinica atualizar(Clinica clinica){

        Connection connection = configuracaoJDBC.getConnection();

        try(PreparedStatement statement = connection.prepareStatement(SQL_ATUALIZAR_CLINICA)){
            statement.setString(1, clinica.getNome());
            statement.setString(2, clinica.getCnpj());
            statement.setString(3, clinica.getRazaoSocial());
            statement.setString(4, clinica.getDescricao());
            statement.setObject(5, clinica.getEndereco());
            statement.setObject(5, clinica.getContato());
            statement.executeUpdate();
            return clinica;
        } catch (Exception e){
            return null;
        }
    }

    @Override
    public void excluir (UUID id){
        Connection connection = configuracaoJDBC.getConnection();
        try(PreparedStatement statement = connection.prepareStatement(SQL_EXCLUIR)){
            statement.setObject(1, id);
            statement.executeUpdate();
        } catch(Exception e){
            e.printStackTrace();
        }

    }

    private Clinica getClinicaByResultSet(ResultSet resultSet) throws SQLException{
        Clinica clinica;
        UUID id = (UUID) resultSet.getObject(1);
        String nome = resultSet.getString(2);
        String cnpj = resultSet.getString(3);
        String razaoSocial = resultSet.getString(4);
        String descricao = resultSet.getString(5);
        Endereco endereco = (Endereco) resultSet.getObject(6);
        Contato contato = (Contato) resultSet.getObject(7);
        clinica = new Clinica(id, nome, cnpj, razaoSocial, descricao, endereco, contato);
        return clinica;
    }
}
