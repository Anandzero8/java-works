import java.util.Scanner;

public class Day_name {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter day number: ");
        int daynum = sc.nextInt();
        System.out.println(getDayname(daynum));
    }
    public static String getDayname(int day) {
        String dayName = "";
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day range";
        }
        return dayName;
    }
}
