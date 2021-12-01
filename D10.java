package Arraylist;

import java.util.Scanner;

public class D10 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Username");
        String S1 = Sc.nextLine();
        System.out.println("Enter Password");
        String S2 = Sc.nextLine();

        if((!(S1.isEmpty()))&&!(S2.isEmpty())){

        if(!(S1.equals(S2)))
            System.out.println("You are ok");
        else
            System.out.println("Invalid details");
        }
        else
            System.out.println("Enter the details");
    }
}
