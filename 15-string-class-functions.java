import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        String a = "Hello World";
        String b = "hello java";
        System.out.println((a == b ) + "\n" + (a.equals(b)) + "\n" + (a.concat(b)) + "\n" + (a.equalsIgnoreCase(b)) + "\n" + Arrays.toString(a.split("")) + "\n" + a.hashCode() +"\n" + a.substring(2) + "\n" + a.indexOf("J") + "\n" + a.toUpperCase() + "\n" + a.toLowerCase());
    }
}
