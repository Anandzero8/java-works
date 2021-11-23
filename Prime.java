public class Prime {
    public static void main(String[]args){
        int num = 5;
        int i = 1;
        int count = 0;
        while(i<=num){  // 1<=5  2<=5
            if(num%i==0)   //5%1=0   5%2!=0
                count++;   // 1
            i++;        //2  3
        }
        if (count==2)
            System.out.println(num +  " is prime");
        else
            System.out.println(num + "is not a prime");
    }
}
