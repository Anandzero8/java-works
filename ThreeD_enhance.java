package Arrays;

public class ThreeD_enhance {
    public static void main(String[] args) {
        int [][][] ja = {{{1},{2,3},{4,5,6}},{{11},{22,33},{44,55,66}}};
        for(int[][]i:ja){
            for(int j[]:i){
                for(int k : j){
                    System.out.print(k + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
