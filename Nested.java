package Interface;

class X {
    void funX(){
        System.out.println("Fun A");
    }
    class Y{
        void funY(){
            System.out.println("Fun B");
        }
    }
}
class Nested {
    public static void main(String[]args){
        X a = new X();
        X.Y b = a.new Y();
        //X.Y b = new X().new Y();
        a.funX();
        b.funY();
    }
}
