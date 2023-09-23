package br.digitalhouse.projetointegrador.dao;

import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.DriverManager;

@Slf4j
public final class ConfiguracaoJDBC{
    private final String urlBancoDeDados;
    private final String usuario;
    private final String senha;
    private Connection connection;

    public ConfiguracaoJDBC() {
        this.urlBancoDeDados = "jdbc:h2:mem:~/test;INIT=RUNSCRIPT FROM 'create.sql'";
        this.usuario = "sa";
        this.senha = "";
    }

    public Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection(urlBancoDeDados, usuario, senha);
            } catch (Exception e) {
                log.error("Eita, não consegui me comunicar com o banco de dados!!!", e);
            }
        }
        return connection;
    }
}