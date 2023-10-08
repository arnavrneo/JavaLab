import java.util.Scanner;

public class dynamicSizeArray {
    public static void main(String[] args) {
        int[] arr;
        System.out.println("Enter the size of the array: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        arr = new int[size]; // dynamic size allocation at runtime
    }
}
