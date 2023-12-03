public class Throws {
    public static int divide(int a, int b) throws ArithmeticException {
        int div = a / b;
        return div;
    }

    public static void main(String[] args) {
        int a = 4;
        int b = 0;
        System.out.println(a + " + " + b + " is: " + divide(a, b));
    }
}