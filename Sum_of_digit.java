import java.util.Scanner;

public class Sum_of_digit {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, digit = 0;
            while(n>0) {
                digit = n % 10; //5
                n /= 10;
                sum = sum+digit;
                System.out.println(sum);
            }
    }
    }



