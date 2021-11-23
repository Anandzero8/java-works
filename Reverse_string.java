import java.util.Scanner;

public class Reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string:");
        char[] letters = sc.nextLine().toCharArray();
        System.out.println("Reverse String is:");
        for(int i=letters.length-1;i>=0; i--){
            System.out.print(letters[i]);
        }
    }
}
