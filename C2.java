package Threading;

public class C2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = Thread.currentThread();
        Thread t2 = new Thread(new Aa());
        Thread t3 = new Thread(new Bb());
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        for(int i=1;i<=10;i++ ){
            Thread.sleep(1000);
            System.out.print(i + " ");
        }

    }
}
class Aa implements Runnable{
    @Override
    public void run() {
        System.out.println();
        for(int i =10; i>0; i--){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(i + " ");
        }
    }
}
class Bb implements Runnable {
    public void run() {
        for (int i = 20; i <= 30; i++) {
          //  try {
                //Thread.sleep(1000);
            //} catch (InterruptedException e) {
              //  e.printStackTrace();
                System.out.print(i + " ");
            }
        }
    }
