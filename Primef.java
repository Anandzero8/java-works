public class Primef {
    public static void main(String[]args){
        for(int i = 2; i<=100; i++){
            int count = 0;
            for (int j =1; j<=i/2; j++){
                if(i%j==0)
                    count++;
            }
            if(count==1)
                System.out.print(i + " ");
        }
    }
}
