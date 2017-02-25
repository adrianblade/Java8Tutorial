package thread;

import java.util.concurrent.Semaphore;

/**
 * Created by Adrian on 05/12/2016.
 */
public class SemaphoreTest {

    // max 4 people
    static Semaphore semaphore = new Semaphore(4);

    static class MyATMThread extends Thread {

        String name = "";

        MyATMThread(String name) {
            this.name = name;
        }

        public void run() {
            SemaphoreUtils.runSemaphore(name, semaphore);
        }

    }

    public static void main(String[] args) {

        System.out.println("Total available Semaphore permits : "
                + semaphore.availablePermits());

        MyATMThread t1 = new MyATMThread("A");
        t1.start();

        MyATMThread t2 = new MyATMThread("B");
        t2.start();

        MyATMThread t3 = new MyATMThread("C");
        t3.start();

        MyATMThread t4 = new MyATMThread("D");
        t4.start();

        MyATMThread t5 = new MyATMThread("E");
        t5.start();

        MyATMThread t6 = new MyATMThread("F");
        t6.start();

    }
}