public class Main{
    public static void main(String[] args) {
        String newStr = "";       
        String str = "This is a good book";

        for (int i=0; i<str.length(); i++) {
            char charAtPos = str.charAt(i);
            if (newStr.indexOf(charAtPos) < 0)
                newStr += charAtPos;
        }

        System.out.println(newStr);
    }
}