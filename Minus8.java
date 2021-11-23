public class Minus8 {
    public static void main(String[]args){
        int num = 13578;
        int i = num;
        int sum = 0;
        int m = 0;
        int j = i%10; // 8
        while(i!=0){
            int k = i%10; // 8, 7, 5, 3, 1
            i/=10;// 1357, 135, 13, 1,
            if(i<0)
                 m = k;
        }
        sum = m-j;
        System.out.println(sum);
    }
}
