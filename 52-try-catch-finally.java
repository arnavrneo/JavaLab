public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int div = 50/0;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("I'm gonna print anyways");
        }
    }
}
