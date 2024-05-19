package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

    public Connection getConexao() {
        
        Connection connection = null;
        
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            String server = "db-mysql-a3-do-user-15943630-0.c.db.ondigitalocean.com";
            String database = "defaultdb";
           
            String url = "jdbc:mysql://" + server + ":25060/" + database + "?useTimezone=true&serverTimezone=UTC";
            String user = "doadmin";
            String password = "AVNS_PNBkFueRKtJ0BTevy09";
            
            connection = DriverManager.getConnection(url, user, password);
            
            if (connection != null){
                System.out.println("Status: Conectado!");
            } 
            else {
                System.out.println("Status: NÃO CONECTADO!");
            }
        } 
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        
        return connection;
    }
}
