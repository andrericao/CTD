package jcbd.animais_db;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    private static final String SQL_CREATE_TABLE = """
            DROP TABLE IF EXISTS Animal;
            CREATE TABLE Animal(
                id VARCHAR(36) PRIMARY KEY NOT NULL,
                nome VARCHAR(100) NOT NULL,
                tipo VARCHAR(100) NOT NULL
            );
            """;

    private static final String PITOCO = "INSERT INTO Animal values('uuid_1', 'pitoco', 'CACHORRO')";
    private static final String SUZI = "INSERT INTO Animal values('uuid_2', 'suzi', 'CACHORRO')";
    private static final String MEAU = "INSERT INTO Animal values('uuid_3', 'meau', 'GATO')";
    private static final String MARYLOO= "INSERT INTO Animal values('uuid_4', 'maryloo', 'VACA')";
    private static final String DRAGAO= "INSERT INTO Animal values('uuid_5', 'dragão', 'DRAGÃO DE KOMODO')";

    private static final String SQL_GET_ALL = "SELECT * FROM Animal;";

    private static final String SQL_DELETE_PITOCO = "DELETE FROM Animal WHERE id='uuid_1';";

    public static void main(String[] args) {
        final Logger log = Logger.getLogger(Main.class);

       Connection connection;

       try{
           log.info("Resgatar conexão");
           connection = getConnection();

           log.info("Criando Statement");
           Statement statement = connection.createStatement();

           log.info("Iniciando Banco de Dados");
           statement.execute(SQL_CREATE_TABLE);

           log.info("Inserindo animais no banco de dados");
           statement.execute(PITOCO);
           statement.execute(SUZI);
           statement.execute(MEAU);
           statement.execute(MARYLOO);
           statement.execute(DRAGAO);
           // execute só executa semelhante ao DELETE

           log.info("Executando GEt ALL no banco de Dados");
           ResultSet resultSet = statement.executeQuery(SQL_GET_ALL);
           //executeQuery quando executado devolve uma lista de resultados semelhante ao GET

           log.info("Logando valores retornados no Banco de Dados");
           while(resultSet.next()){
               log.info("id: %s | nome: %s | tipo: %s"
                       .formatted(
                               resultSet.getString(1),
                               resultSet.getString(2),
                               resultSet.getString(3))
               );

           }

           log.info("Excluindo pitoco do sistema");
           statement.execute(SQL_DELETE_PITOCO);

           log.info("Executando GEt ALL no banco de Dados");
           resultSet = statement.executeQuery(SQL_GET_ALL);
           //executeQuery quando executado devolve uma lista de resultados semelhante ao GET

           log.info("Logando valores retornados no Banco de Dados");
           while(resultSet.next()) {
               log.info("id: %s | nome: %s | tipo: %s"
                       .formatted(
                               resultSet.getString(1),
                               resultSet.getString(2),
                               resultSet.getString(3))
               );
           }

       } catch (Exception e){
            log.error(e);
       }
    }

    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:file:./db/test", "sa","");
    }
}
