package Threading;

public class C3 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new One(1));
        Thread t2 = new Thread(new One(2));
        t1.start();
        t1.join();
        t2.start();
    }
}
class One implements Runnable{
    int id;
    One(int id){this.id=id;}
    public void run(){
        if(id==1){
            for(int i=1; i<=10; i++ )
                System.out.print(i+" ");
        }
            else{
                for(int i = 10; i>0; i--)
                    System.out.print(i + " ");
        }
        System.out.println();
    }
}
