package Arraylist;

import java.util.Scanner;

public class D11 {
    public static void main(String[] args) {
        System.out.println("Enter the word to reverse");
        Scanner S1= new Scanner(System.in);
        String name = S1.nextLine();
        name = name.replaceAll(" ","");
        StringBuffer S2 = new StringBuffer(name);
        S2= S2.reverse();
        String rever = S2.toString();

        if (name.equals(rever))
            System.out.println("is a palindrome");
        else
            System.out.println("is not a palindrome");
    }
}
