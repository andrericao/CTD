package jcbd.conta_db.db;

import java.sql.Connection;
import java.sql.SQLException;

public class ContaRepository {
    private final Connection connection;

    public ContaRepository() throws Exception {
            this.connection = ConfigurationConnection.getConnectiom();
    }

    public Conta buscaContaPorId(String id) {
        connection.createStatement();
        return null;
    }

    public void excluiContaPorId(){

    }

    public Conta criarConta(){
        return null;
    }
}
