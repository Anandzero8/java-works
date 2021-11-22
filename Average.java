import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        System.out.println("Enter num 1");
        Scanner sc = new Scanner(System.in);
        int num_1 = sc.nextInt();
        System.out.println("Enter num 2");
        int num_2 = sc.nextInt();
        System.out.println("Enter num 3");
        int num_3 = sc.nextInt();

        System.out.println("Average is "+ (num_1+num_2+num_3)/3);

    }
}
