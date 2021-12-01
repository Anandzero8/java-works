package Exceptional_handling;

public class B1 {
    public static void main(String[] args) {
        try {
            int x = 0;
            int y = 42 / x;
            System.out.println(y);
        } catch (ArithmeticException e) {
            System.out.println("x cannot be zero");
        }
    }
}
