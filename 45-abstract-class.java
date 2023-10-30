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
}

public class abstractClass{
    public static void main(String[] args) {
        Loop x = new Loop();
        x.set(4);
        x.show();
    }
}
