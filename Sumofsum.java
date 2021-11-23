public class Sumofsum {
    public static void main(String[] args) {
        int num = 12345;
        int i = num;
        while (i > 9) { //54321>9   15>9
            int sum = 0;
            while (i > 0) { // 12345>0   1234>0  1234>0 123>0  123>0 12>0  1>0
                int r = i % 10; // 5 4 3 2 1
                sum = sum + r;  // 0+5=5, 9, 12, 14, 15
                i /= 10;   // 1234 123 12 1 0
            }
            i = sum;  // 15 6
        }
        System.out.println(num + " " + i);
    }
}