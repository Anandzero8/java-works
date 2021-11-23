public class wh {
    public static void main(String[]args){
        int num =153;
        while(num<=1000) // 153 to 1000
        {
            int i= num;
            int sum = 0;
            while(i>0)
            {
                int r = i%10; // 3 5 1
                sum = sum + (int)Math.pow(r,3); // 27 152 153
                i/=10; //15 1
            }
            if(num==sum)
                System.out.println(num);
            num++;
        }
    }
}
