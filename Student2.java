package Interface;

interface Anna1 {
    void placements1();
}
interface Akka {
    void placements2();
}
class Wipro1 implements Anna1,Akka{


    @Override
    public void placements1() {
        System.out.println("Interview on monday");
    }

    @Override
    public void placements2() {
        System.out.println( "Interview on tuesday");
    }
}
class info1 implements Anna1,Akka{

    @Override
    public void placements1() {
        System.out.println("Interview on wednesday");
    }

    @Override
    public void placements2() {
        System.out.println("Interview on Thursday");
    }
}
class Students2{
    public static void main(String[]args){
        Anna1 A = new Wipro1();
        Akka B = new Wipro1();
        A.placements1();
        B.placements2();
        Anna1 A1 = new info1();
        Akka B1 = new info1();
        A1.placements1();
        B1.placements2();
    }
}
