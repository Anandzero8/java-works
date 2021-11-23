public class Strongf {
    public static void main(String[] args) {
        for (int num = 145; num <= 10000; num++) {
            int i = num;
            int sum = 0;

            for (int j = i; j > 0; j /= 10){  // 145  14  1
                int r = j % 10; //5 4 1
                int fact = r;
                int mul = 1;
                while (mul <= fact){
                    mul = mul * fact;   // 5 20 60 120 120
                    fact = fact - 1;      // 4 3 2 1
                }
              sum=sum+mul;
            }

            if (sum == num)
                System.out.println(num);
        }
    }
}