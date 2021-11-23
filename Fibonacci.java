public class Fibonacci {
    public static void main(String[]args){
        int a = 0, b=1;
        System.out.print(a + " " + b + " ");
        int terms = 0;
        while(terms<=8){
            int c = a+b;
            System.out.print(c + " ");
            a=b;
            b=c;
        terms++;
        }

    }
}
