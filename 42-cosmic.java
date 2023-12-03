package minor2;

class cosmic extends Object {
    private int x;
    public cosmic(int x) {
        this.x = x;
    }
    public String toString() {
        return String.format("Number: %d", this.x);
    }

    public int hashCode() {
        return super.hashCode();
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
public class Main {
    public static void main(String[] args) {
        cosmic obj = new cosmic(4);
        System.out.println(obj);
        System.out.println(obj.hashCode());
        System.out.println(obj.equals(new cosmic(5)));
    }

}
