package Arrays;

public class TwoDEnhance {
    public static void main(String[] args) {
        int[][] jagg = {{1},{2,3},{4,5,6}};
        for(int[] i :jagg){
            for(int j:i)
                System.out.print(j + " ");
            System.out.println();

        }
    }
}
