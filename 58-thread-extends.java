class P extends Thread {
    public void run() {
        System.out.println("My Thread is running now...");
    }
}

public class Threads {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        P p = new P();
        p.start();
    }
}