public class Powersum {
    public static void main(String[]args){
        int number = 1;
        int sum = 0;
        while(number<=9){
            sum = sum + (int)Math.pow(number,2);
            number+=2;
        }
        System.out.println(sum);
    }
}

/*     int sum= 0;
           for(int i =1;i<=9;i+=2)
            sum = sum + Math.pow(i,2);
                sout()
 */