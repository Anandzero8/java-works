import java.util.Scanner;

public class Pattern_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int NUM = sc.nextInt();
        int rows = NUM;

        for(int i=rows-1; i>=0; i--){       // 5;
            for(int j=0; j<i; j++){          //1;
                System.out.print(" . ");
            }
            System.out.println();
        }
    }
}
