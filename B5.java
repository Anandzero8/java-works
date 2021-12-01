package Exceptional_handling;

public class B5 {
    public static void main(String[] args) {
        try {
            int x = 1,y;
            if (x == 0)
            throw new ArithmeticException();
                else
                    y = 42 / x;
            System.out.println(y);
        }catch (ArithmeticException e){
            System.out.println("you are caught");
        }
    }
}
