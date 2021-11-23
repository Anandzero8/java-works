import java.io.Console;
import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter username to register");
        String username = sc.nextLine();
        System.out.println("Enter password");
        String password = sc.nextLine();
        System.out.println("enter username");
        String name = sc.nextLine();
        System.out.println("enter password");
        String Upassword = sc.nextLine();
        if(password.equals(Upassword)){
            System.out.println("you are logged in");
        }
        else{
            System.out.println("unable to login");
        }
    }
}
