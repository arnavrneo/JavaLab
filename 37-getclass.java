class Parents {
    private int x = 4;
}

class Children extends Parents {
    private int x = 3;
}
public class getClass {
    public static void main(String[] args) {
        Object string = new String("Hello");
        System.out.println(string.getClass()); // getClass

        Children child1 = new Children();
        Children child2 = null;
        System.out.println(child1 instanceof Parents);
        System.out.println(child2 instanceof Parents);
    }
}
