class Parent1 {
    private String x;
    Parent1() {
        this.x = "Name of parent";
    }

    public void demo() {
        System.out.println(this.x);
    }
}

class Child1 extends Parent1 {
    private String x;
    Child1() {
        this.x = "Name of Child";
    }

    public void demo() {
        System.out.println(this.x);
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Child1 child = new Child1();
        child.demo();
    }
}
