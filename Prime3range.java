public class Prime3range {
    public static void main(String[]args){
        int i = 2;
        while(i<=100){    //2<=100
            int j = 1;
            int c = 0;
            while (j<=i/2){  //1<=1,  2<=1
                if(i%j==0) //2%1=0
                    c++;   //1
                j++;     //2
            }
            if(c==1)
                System.out.print( i+" "  );
            i++;
        }
    }
}
