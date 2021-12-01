package Arrays;

public class ThreeD {
    public static void main(String[] args) {
        int[][][] jagi = {
                {{1}, {2, 3}, {4, 5, 6}},
                {{11}, {22, 33}, {44, 55, 66}}};

        for (int i = 0; i < jagi.length; i++) {
            for (int j = 0; j<jagi[i].length; j++) {
                for (int k = 0; k<jagi[i][j].length; k++)
                    System.out.print(jagi[i][j][k] + " ");
                System.out.println();
            }
            System.out.println();
        }
    }
    }




