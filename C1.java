package Threading;

public class C1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = Thread.currentThread();
        t.setName("Parent");
        t.setPriority(10);
        System.out.println(t);
        for(int i=1; i<=10; i++){
                Thread.sleep(1000);
            System.out.println(i);
        }
    }
}
