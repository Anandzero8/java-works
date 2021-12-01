package Exceptional_handling;

public class B4 {
    public static void main(String[] args) {
        try{
            int x = 0;                  // x = 0;
            int y = 42/x;
            try{
                int [] a = new int[1];        //a = [1];
                a[x++] = 100;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Index error");
            }
        }catch (ArithmeticException e){
            System.out.println("zero division error");
        }
        System.out.println("no error");
    }
}
