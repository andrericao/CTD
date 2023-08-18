package jcbd.conta_db.db;

import org.apache.log4j.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConfigurationConnection {
    private static final Logger log = Logger.getLogger(ConfigurationConnection.class);
    private static Connection connection;
    private static final String SQL_INIT_DB = """
            DROP TABLE IF EXISTS conta;
            CREATE TABLE conta(
                id VARCHAR(36) PRIMARY KEY NOT NULL,
                nome VARCHAR(100) NOT NULL,
                numero VARCHAR(19) NOT NULL,
                saldo INT NOT NULL 
            );
            """;

    public static Connection getConnectiom() throws Exception{

        log.info("Valida se existe conexão criada");
        if(connection == null) {

            log.info("Nenhuma conexão criada. criando conexão");
            Class.forName("org.h2.Driver").newInstance();
            connection = DriverManager.getConnection("jbcd:h2:file:./db2/test", "sa", "");

            log.info("Criando tabela do banco de dados");
            Statement statement = connection.createStatement();
            statement.execute(SQL_INIT_DB);
        }

        return connection;
    }
}
