interface myInterface {
    int a = 10;
    void show();
}

public class Interface implements myInterface {
    public void show() {
        System.out.println("I'm from Interface.");
    }

    public static void main(String[] args) {
        Interface x = new Interface();
        x.show();
        System.out.println("Value of a: " + a);
//        a = 4; // cannot change value
    }
}
