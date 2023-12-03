class MyException extends Exception {
    public MyException(String s) {
        super(s); // parent exception constructor
    }
}
public class CustomException {
    public static void main(String[] args) {
        try {
            throw new MyException("My Error");
        } catch (MyException e) {
            System.out.println("Caught");
            System.out.println(e.getMessage());
        }
    }
}
