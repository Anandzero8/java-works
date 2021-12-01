package Arrays;

public class Jagged_array3D {
    public static void main(String[] args) {
        int[][][] Jag = new int[2][3][];
        Jag [0] = new int[][] {{10},{11,12},{13,14,15}};
        Jag [1] = new int[][] {{16},{17,18},{19,20,21}};

        for(int[][]i:Jag){
            for(int[]j:i){
                for(int k:j){
                    System.out.print(k + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
