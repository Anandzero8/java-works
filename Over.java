class over {
    void sleep(){
        System.out.println("A is sleeping");
    }
}
class D extends over{
    void sleep(){
        super.sleep();
        System.out.println("B is sleeping");
    }
}
class E{
    public static void main(String[]args){
        D d1 = new D();
        d1.sleep();
    }
}

