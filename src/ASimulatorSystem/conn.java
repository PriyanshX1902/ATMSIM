package ASimulatorSystem;

import java.sql.*;  

public class conn{

    public static Connection conn(){
        Connection connection = null;
        Statement statement = null;
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            connection =DriverManager.getConnection("jdbc:mysql://localhost/","root","kame");
            statement =connection.createStatement();
            statement.executeUpdate("Use ATM");

        }catch(Exception e){ 
            System.out.println(e);
        }
        return connection;
    }  
}  