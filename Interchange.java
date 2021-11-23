import java.util.Locale;

public class Interchange {

    public static void main(String[] args) {
	int number1 = 5;
    float number2 = 2;
    String str = "ABCD";

    String letter = Integer.toString(number1);
    int number3 = Float.floatToIntBits(number2);

        System.out.println("float into bit int value of 2: "+number3);
        System.out.println("int into string of 1: "+letter);
        System.out.println("Addition of Number1 & Number2: "  + (number1+number2));
        System.out.println("Cap into small: "+str.toLowerCase(Locale.ROOT));
    }
}
