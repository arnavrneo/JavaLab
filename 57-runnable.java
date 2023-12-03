class Run implements Runnable {
    int x = 0;

    public void run() {
        for (int i: new int[]{1, 2, 3}) {
            x += i;
        }
        System.out.println("Current Thread: " + Thread.currentThread().getName());
        System.out.println("Sum: " + x);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Current Thread: " + Thread.currentThread().getName());
        Runnable r = new Run();
        Thread t = new Thread(r);
        t.start();
    }
}
