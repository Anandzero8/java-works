import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Z6 {
    int x = 1000;
    public static void main(String[] args) throws IOException {
        Z6 a = new Z6();
        BufferedReader B = new BufferedReader(new InputStreamReader(System.in));
        String s= B.readLine();
        System.out.println(s);
        System.out.println(a.x + " days blockbuster hit");
    }
}
