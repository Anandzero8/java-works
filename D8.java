package Arraylist;

import javax.swing.*;
import java.util.Scanner;

public class D8 {
    public static void main(String[] args) {
        Scanner S1 = new Scanner(System.in);
        System.out.println("Enter the username");
        String username = S1.nextLine();
        System.out.println("Enter the password");
        String Password = S1.nextLine();

        if (!(username.isEmpty())&&(!(Password.isEmpty())))
        {
            if (username.equals("Chennai") && Password.equals("Chennai"))
                System.out.println("You are OK");
            else
                System.out.println("Invalid username/password");
        }
        else
        System.out.println("Username and password cannot be empty");

    }
}
