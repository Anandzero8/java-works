public class Iipattern {
    public static void main(String[] args) {
       for(int i = 1; i<9; i++){
           for(int j = 1; j<10; j++){
               if(i==1 || i==8 || (j==4))
                   System.out.print("i");
             //  else if (j==4)
              //         System.out.print("$");
               else
                   System.out.print(" ");
           }
           System.out.println();
       }
    }
}
