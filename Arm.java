public class Arm {
    public static void main(String[] args) {

        for (int i = 153; i <= 10000; i++) { // 153 - 10000
            int sum =0;

            for (int j = i; j > 0; j/=10) { // j= 153, 15, 1
                int r = j % 10;           // 3, 5, 1
                sum = sum + (int)Math.pow(r, 3);  // 27 152 153
            }
            if (sum == i)
                System.out.println(i);
        }
    }
}
