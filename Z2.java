public class Z2 {
    public static void main(String[] args) {
        int x = 11; int y = 3;
        x = x+y; // 14
        y = x-y; //11
        x = x-y;
        System.out.println("x="+x + " "+ "y="+y);
        Z2.Method1();

    }
    public static void Method1(){
        int x = 11; int y = 3;
        y=(x+y)-(x=y);
        System.out.println(x+" "+y);
    }
}
