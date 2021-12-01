package Interface;

interface M{
    void m(int a, int b);
    void m(int a, int b, int c);
}
class C implements M{
    public void m(int a, int b){
        System.out.println(a+b);
    }
    public void m(int a, int b, int c){
        System.out.println(a+b+c);
    }

}
class Mass{
    public static void main(String[]args){
        M ma = new C();
        ma.m(2,3);
        ma.m(2,3,4);
    }
}
