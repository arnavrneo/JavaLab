import java.util.Arrays;

public class arrayUtility {
    public static int[] setArray() {
        int[] arr = {5, 4, 3, 2, 1};
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = setArray();
        arr1 = setArray();
        Arrays.fill(arr1, 3);
        System.out.println("Arrays filled with 3: " + Arrays.toString(arr1));
        arr1 = setArray();
        Arrays.sort(arr1);
        System.out.println("Sorted Array: " + Arrays.toString(arr1));
        int idx = Arrays.binarySearch(arr1, 4);
        System.out.println("Binary Search for 4: at index " + idx);
        int[] arr2 = Arrays.copyOf(arr1, 3);
        System.out.println("Copied arr with new length 3: " + Arrays.toString(arr2));
        int compare = Arrays.compare(arr1, arr2);
        System.out.println("Two are arrays are compared lexicographically, res: " + compare);
    }
}
