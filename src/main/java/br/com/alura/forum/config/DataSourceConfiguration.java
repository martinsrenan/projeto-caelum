package br.com.alura.forum.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfiguration {

    /* DATASOURCE DE DESENVOLVIMENTO
    @Bean
    public DataSource desenvolvimento() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/alura_forum?useSSL=false");
        dataSource.setUsername("root");
        dataSource.setPassword("");
        return dataSource;
    } */

    /* DATASOURCE DE PRODUCAO */
    @Bean

    public DataSource producao() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://192.168.0.240:3306/alura_forum?useSSL=false");
        dataSource.setUsername("alura");
        dataSource.setPassword("qwert123");
        return dataSource;
    }
}