package Arrays;

class A1 {
    public static void main(String[] args) {
        int [] A = {10, 20, 30, 40, 50};
        //for (int i = 0; i < A.length; i++)
           // System.out.println(A[i]);
        for (int a:A)               //enhance version
            System.out.print(a + " ");
    }}