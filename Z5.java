public class Z5 {
    public static void main(String[] args) {
        A a = new B();
        a.I();
        System.out.println(a.i);
    }
}

class A{
    int i =10;
    void I() {
        System.out.println(i);
    }
}
    class B extends A{
        int i = 20;
        void I() {
            System.out.println(i);
        }
}




