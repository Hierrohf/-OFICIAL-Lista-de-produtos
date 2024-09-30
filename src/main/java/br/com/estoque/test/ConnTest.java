package br.com.estoque.test;

import br.com.estoque.connection.Conn;

public class ConnTest {

    public static void main(String[] args) {
        Conn conn = new Conn();
        if (conn != null){
            conn.closeConnection();
            System.out.println("conecxao aberta e fechada com suceso");
        }
    }
}
