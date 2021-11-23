import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        System.out.println("enter number 1-100");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2!=0){
            System.out.println(num + " is odd number");
        }
        else{
            System.out.println(num + " is even number");
        }
    }
}
