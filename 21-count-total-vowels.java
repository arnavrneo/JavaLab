public class Main {
    public static void main(String[] args) {
        String string = String.join(" ", args);

        int count[] = {0, 0, 0, 0, 0};
        char[] ch = string.toCharArray();

        for (char c: ch) {
            if (c == 'a') 
                count[0]++;
            else if (c == 'e')
                count[1]++;
            else if (c == 'i')
                count[2]++;
            else if (c == 'o')
                count[3]++;
            else if (c == 'u')
                count[4]++;
        }

        System.out.printf("'a' count: %d\n'e' count: %d\n'i' count: %d\n'o' count: %d\n'u' count: %d", 
                                count[0], count[1], count[2], count[3], count[4]);
    }
}