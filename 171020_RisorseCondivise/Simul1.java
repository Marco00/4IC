import java.util.concurrent.TimeUnit;

public class Simul1 {
    public static void main(String[] args) {
        Risorsa r1 = new Risorsa("risorsa1");
        Thread t1 = new Thread(new Task(r1));
        Thread t2 = new Thread(new Task(r1));
        t1.setName("thread1");
        t2.setName("thread2");
        t1.start();
        t2.start();
        try{
            TimeUnit.SECONDS.sleep(10);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        t1.interrupt();
        t2.interrupt();
    }
}
