package Exceptional_handling;

public class B3 {
    public static void main(String[] args) {
        try{
            int x = 1;
            int y = 42/x;
            int [] a = new int[2];
            a[x++]=100;
        }catch (ArithmeticException e){
            System.out.println("zero division error");
        }catch (ArrayIndexOutOfBoundsException E){
            System.out.println("index bounced");
        }
        System.out.println("no error");
    }
}
