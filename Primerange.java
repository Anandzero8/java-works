public class Primerange {
    public static void main(String[]args){
        int num = 2;
        while(num<=100){
            int i =1;
            int count = 0;
            while(i<=num/2){
                if(num%i==0)
                    count++;
                i++;
            }
            if(count==1)
                System.out.print(num+" ");
            num++;


        }
    }
}
