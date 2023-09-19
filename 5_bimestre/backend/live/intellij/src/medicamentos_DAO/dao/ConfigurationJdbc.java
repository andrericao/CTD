package medicamentos_DAO.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConfigurationJdbc {
    private String driver;
    private String urlh2;
    private String user;
    private String password;
    private Connection connection;

    public ConfigurationJdbc(){
        this.driver = "org.h2.Driver";
        this.urlh2 = "jdbc:h2:~/test;INIT=RUNSCRIPT FROM 'create.sql'";
        this.user = "sa";
        this.password = "";
    }
    public Connection getConnection(){
        if(connection == null){
            try{
                connection = DriverManager.getConnection(urlh2, user, password);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        return connection;
    }

}
