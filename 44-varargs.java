public class varargs {
    public static void sum(float ...a) {
        float val = 0;
        for (int i=0; i<a.length; i++) {
            val += a[i];
        }
        System.out.println("The sum is: " + val);
    }

    public static void main(String[] args) {
        sum(1, 2, 3, 4);
    }
}
