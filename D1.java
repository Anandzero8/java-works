package Arraylist;


import java.util.ArrayList;

public class D1{
    public static void main(String[] args) {
        //create an array list
        ArrayList al = new ArrayList();
        System.out.println("Initial size of al:"+ al.size());
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1,"A2");
        System.out.println( al.size() + " " + al);
        al.remove("F");
        al.remove(2);
        System.out.println( al.size() + " " + al);


    }
}
