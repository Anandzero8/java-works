package Arrays;

public class TwoD {
    public static void main(String[] args) {
        //this is a jagged array or rageed array
        int[][] jag = {{1},{2,3},{4,5,6}};
        for (int i = 0; i<jag.length; i++){
            for(int j =0; j<=i; j++)
                System.out.print(jag[i][j] + " ");
            System.out.println();
        }
    }
}
