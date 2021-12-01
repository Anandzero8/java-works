package Exceptional_handling;

public class B2 {
    public static void main(String[] args) {
        try {
            int[] a = new int[1];
            a[1] = 100;               //index is out of range problem
            for (int b : a)
                System.out.println(b);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of range");
        }
    }
}
