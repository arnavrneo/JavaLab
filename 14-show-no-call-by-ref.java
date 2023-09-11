public class Main{
    public static void main(String[] args){
        int a =3;
        int b=4;
        System.out.println("The Sum: " + (a+b));
        add(a,b);
        System.out.println("The Sum after: " + (a+b));
    }
    public static void add(int a, int b){
        a=10;
        System.out.println("The Sum is add(): " + add(a+b));
    }
}