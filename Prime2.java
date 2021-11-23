public class Prime2 {
    public static void main(String[]args){
        int num = 5;
        int i = 1;
        int c = 0;
        while(i<num/2){  //1<=2,   2<=2,
            if(num%i==0)
                c++;
            i++;

        }
        if(c==1)
            System.out.println(num + " is prime");
    }
}
