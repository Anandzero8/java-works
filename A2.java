package Arrays;

public class A2 {
    public static void main(String[]args){
        int [][] A = {{1,2,3},  {4,5,6},  {7,8,9}};                 //   for(int i[] :A){
                                                                    //     for(int j : i)
        for (int i=0; i<3; i++){                                    //           sout(j + " ");
            for(int j =0; j<3; j++){                                //     sout println();
                                                                        // i = 0  j = 0
                System.out.print(A[i][j] + " ");                         //i = 0  j = 1
            }                                                            //i = 0  j = 2
            System.out.println();
        }
    }
}
