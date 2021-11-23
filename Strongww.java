public class Strongww {
    public static void main(String[] args){
        int num = 145;
        int i = num;
        int sum = 0;
        while(i>0)
        {
            int r = i%10; //5, 4, 1
            int fact = r; //5 4 1
            int mul = 1;
            int j = 1;
            while(j<=fact) // 1<=5, 2<=5, 3<=5 4<=5, 5<=5
            {
                mul = mul * j; // 1, 2, 6, 24, 120
                j++; // 2, 3, 4, 5, 6
            }
            sum = sum + mul; // 120
            i/=10; //14, 1
        }
        if(num==sum)
            System.out.println(num + " "+ "is a strong number" );
        else
            System.out.println(num + " " + "is not a strong number");
    }
}
