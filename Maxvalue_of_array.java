import java.util.Arrays;

public class Maxvalue_of_array {
    public static void main(String[] args) {
        int array[] ={20,30,50,40,90,80};
        System.out.println("array values are:" + Arrays.toString(array));
        int max = array[0];
        if(array[5]>=max){
            max = array[5];
            System.out.println("max value: "+max);
        }

    }
}
