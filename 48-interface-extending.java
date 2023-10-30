interface A {
    void A1();
}

interface B extends A {
    void B1();
}

class Extend implements B {
    public void A1() {
        System.out.println("I'm A");
    }

    public void B1() {
        System.out.println("I'm B");
    }

}

public class interfaceExtend {
    public static void main(String[] args) {
        Extend x = new Extend();
        x.A1();
        x.B1();
    }
}
