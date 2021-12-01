package Arrays;

public class A3 {
    public static void main(String[] args) {
        int[][][] A = {{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9,}, {10, 11, 12}}};
        for (int[][] i : A) {
            for (int j[] : i) {
                for (int k : j) {
                    System.out.print(k + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}



       /* for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    System.out.print(A[i][j][k]+ " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
} */