package com.learn;

public class Gravilaw{

    public static void main(String[] args)
    {
        double g = 6.674 * Math.pow(10, -11);
        byte m = 1, n = 2, r = 5;
         double F = (g * m * n)/Math.pow(r,2);
        System.out.println(F);
    }
}
