package Arrays;

public class Jagged_array {
    public static void main(String[] args) {
        int [][] jag = new int[3][3];
        jag [0] = new int [] {1,2,3};
        jag[1] = new int[]{4,5,6};
        jag[2] = new int[]{7,8,9};

        for(int [] i : jag){
            for( int j: i)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}