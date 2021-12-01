package Sql;

import javax.script.ScriptContext;
import java.io.PrintWriter;
import java.sql.*;

public class S2 {
    private ScriptContext response;
    PrintWriter out = (PrintWriter) response.getWriter();
    response.("text/html");
    Class.("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anand","root","root");
    Statement st = con.createStatement();
    boolean b = false;

        while (rs.next()){
        String s1 = rs.getString(1);
        String s2 = rs.getString(2);
        String password;
        String username;
        if (username.equals(s1)&& password.equals(s2)){
            b= true;
            break;
        }
    }

    public S2() throws SQLException {
    }
        if(b)
            System.out.println("welcome"+" "+username);
        else
                System.out.println("login failure");
}
