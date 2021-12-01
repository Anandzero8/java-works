class A{
    int m,n;
    A(int mm, int nn){
        m = mm;
        n = nn;
    }
    void display1(){
        System.out.println("m and n are:"+m+" "+n);
    }
}
class B extends A{
    int c;
    B(int mm, int nn, int cc){
        super(mm,nn);
        c = cc;
    }
    void display2(){
        System.out.println("c :" + c);
    }
    void sum(){
        System.out.println("m+n+c = " + (m+n+c));
    }
}

class Call {
        public static void main(String[]args){
    B b1 = new B(10,5,2);
    b1.sum();
    b1.display1();
    b1.display2();
}
}