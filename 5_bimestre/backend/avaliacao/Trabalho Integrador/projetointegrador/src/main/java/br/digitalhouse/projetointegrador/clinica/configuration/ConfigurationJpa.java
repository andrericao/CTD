package br.digitalhouse.projetointegrador.clinica.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class ConfigurationJpa {

    @Bean
    public DataSource dataSource() {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/clinicaCheck");
        dataSource.setUsername("root");
        dataSource.setPassword("root");

        return dataSource;
    }
}
// docker run -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root -d mysql