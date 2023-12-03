class Z implements Cloneable {
    int i;
    String a;

    public Z(int i, String a) {
        this.i = i;
        this.a = a;
    }

    public Z clone() throws CloneNotSupportedException {
        return (Z) super.clone();
    }
}

public class Clone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Z z = new Z(1, "Hello");
        Z b = z.clone();
        b.i = 3;
        b.a = "World";
        System.out.println(b.i);
        System.out.println(b.a);
        System.out.println(z.i);
        System.out.println(z.a);
        System.out.println(z == b);
    }
}
