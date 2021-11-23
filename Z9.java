import java.util.Calendar;
import java.util.Date;

public class Z9 {
    public static void main(String[] args) {
        String s1 = "Beautiful";
        String s2 = "The World is Beautiful";
        System.out.println(s1.substring(0,6));
        System.out.println(s1.indexOf("i"));
        System.out.println(s2.indexOf(" is"));

        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        Date d = new Date();
        System.out.println(d);
    }
}
