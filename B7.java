package Exceptional_handling;

public class B7 {
    public static void main(String[] args) {
        try{
            int x = 0;
            int y = 42/x;
        }catch (ArithmeticException e){
            System.out.println("Caught");
        }finally {
            System.out.println("Iam finally");
        }
    }
}
