abstract class Abstract {
    public int x;
    abstract public void set(int x);
    public void show() {
        for (int i=0; i<this.x; i++)
            System.out.println(i);
    }
}

class Loop extends Abstract {
    public void set(int x) {
        this.x = x;
    }

    public void call() {
        System.out.println("I'm Subclass' function!");
    }
}

public class abstractClass{
    public static void main(String[] args) {
        Abstract x = new Loop();
        x.set(4);
        x.show();
        x.call(); // cant call
    }
}
