public class Main{
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder("Reverse");
        String newString = string.reverse().toString();
        System.out.println("The reversed string: "+ newString);
        System.out.println("The StringBuilder string: " + string);
    }
}