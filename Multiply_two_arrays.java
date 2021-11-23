public class Multiply_two_arrays {
    public static void main(String[] args) {
        int top_array[]={2,4,6};
        int bottom_array[]={3,7,9};

         for(int i=0; top_array.length>i; i++){
            int num1 = top_array[i];
            int num2 = bottom_array[i];
            System.out.println(num1*num2+" ");
        }
    }
}
