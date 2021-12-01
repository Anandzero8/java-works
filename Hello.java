package Sql;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Hello {
    public static void main(String[] args) throws
            ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection
                ("jdbc:mysql://localhost:3306/anand","root","root");
        System.out.println("You are ok Anand !!!!!");
    }
}
