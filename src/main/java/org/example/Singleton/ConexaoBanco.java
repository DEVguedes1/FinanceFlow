package org.example.Singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexaoBanco {

    private Connection connection;
    private static ConexaoBanco conexaoBanco;

    private ConexaoBanco() {
        try {
            Properties props = new Properties();
            props.load(new FileInputStream("src/main/resources/config.properties"));

            String url = props.getProperty("db.url");
            String user = props.getProperty("db.user");
            String pass = props.getProperty("db.password");
            this.connection = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            System.err.println("Erro detectado: "+ e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ConexaoBanco getInstance(){
        if (conexaoBanco == null) {
            conexaoBanco = new ConexaoBanco();
        }
        return conexaoBanco;
    }

    public Connection getConnection() {
        return connection;
    }

}
