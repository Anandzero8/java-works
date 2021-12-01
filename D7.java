package Arraylist;

import java.util.Scanner;

public class D7 {
    public static void main(String[] args) {

        System.out.println("Enter any name");
        Scanner S1 = new Scanner(System.in);
        String name = S1.nextLine();

        System.out.println("Enter the age");
        int age = S1.nextInt();
        System.out.println(name + " " + age);

        System.out.println("Enter job");
        Scanner S2 = new Scanner(System.in);
        String job = S2.nextLine();
        System.out.println(name + " " + age + " "+ ":" + job );

    }
}
