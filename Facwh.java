public class Facwh {
    public static void main(String[]args){
        int num = 5;
        int mul = 1;
        while(num>0)
        {
            mul=mul*num; // 5, 20, 60, 120, 120
           // num--; // 4,3

            num = num-1; // 4, 3, 2, 1
        }
        System.out.println(mul);
    }
}