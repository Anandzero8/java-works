package Sql;

import java.sql.*;
import java.util.Scanner;

public class Fita {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println("enter username and password");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String password = sc.nextLine();

        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/anand","root","root");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from login");
        boolean b = false;

        while (rs.next()){
            String s1 = rs.getString(1);
            String s2 = rs.getString(2);
            if (username.equals(s1)&& password.equals(s2)){
                b= true;
                break;
            }
        }
        if(b)
            System.out.println("welcome"+" "+username);
        else
            System.out.println("login failure");
    }
}
