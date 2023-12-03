public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5] = 30/0;
        } catch (ArithmeticException e) {
            System.out.println("Undefined divison");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bound");
        } catch (Exception e) {
            System.out.println("Exception occured");
        }
        System.out.println("Rest of the code");
    }
}