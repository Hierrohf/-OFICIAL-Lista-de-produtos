package br.com.estoque.connection;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

//import static sun.awt.FontConfiguration.loadProperties;

public class Conn {

    private static Connection conn = null;

    public static Connection getConnection()  {
        if (conn == null){
            try {
                Properties props = loadProperties();
                String url = props.getProperty("dburl");
                conn = DriverManager.getConnection(url, props);
            }
            catch (SQLException e){
                e.printStackTrace();
                System.out.println("falha na conecxao");
            }
        }
        return conn;
    }

    public static void closeConnection(){
        if (conn != null){
            try {
                conn.close();
            }
            catch (SQLException e){
                e.printStackTrace();
                System.out.println("falha ao fechar a concxao");
            }
        }

    }

    public static Properties loadProperties(){
        try (FileInputStream fs = new FileInputStream("oracleProperties")){
            Properties props = new Properties();
            props.load(fs);
            return props;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void closeStatement (Statement st){
        if (st != null){
           try {
               st.close();
           }
           catch (SQLException e){
               e.printStackTrace();
               System.out.println("falha ao fechar o statement");
           }
        }
    }

    public static void closeResutset(ResultSet rs){
        if (rs != null){
            try {
                rs.close();
            }
            catch (SQLException e){
                e.printStackTrace();
                System.out.println("falha ao fechar o ResultSet");
            }
        }
    }

}
