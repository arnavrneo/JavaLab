class Functions implements Runnable {

    public void run() {
        for (int i=0; i<4; i++) {
            System.out.println(Thread.currentThread().getName() + i);
            try {
                Thread.sleep(1011);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Runnable r = new Functions();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        try {
            t1.join(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Is t1 alive? " + t1.isAlive());
        t2.start();
    }
}
