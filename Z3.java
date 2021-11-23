public class Z3 {
    public static void main(String[] args) {
        for(int i = 0; i<4;i++){
            for(int j=0;j<6;j++){
                if(i==1 && j==3)
                        System.out.print("*");
                else if(i==2 && (j==2 || j==3 || j==4))
                        System.out.print("*");
                else if(i==3&&(j==1||j==5))
                        System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
