package br.digitalhouse.exericio.medicines.dao;

import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@AllArgsConstructor
public class ConfigurationJDBC {
    private String jdbcDriver;
    private String dbUrl;
    private String userName;
    private String password;

    public ConfigurationJDBC(){
        this.jdbcDriver = "org.h2.Driver";
        this.dbUrl = "jdbc:h2:mem:medicines;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'create.sql'";
        this.userName = "sa";
        this.password = "";
    }

    public Connection databaseConnect(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(dbUrl, userName, password);
        } catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return connection;
    }

}
