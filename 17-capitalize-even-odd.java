public class Main {
    public static void main(String[] args){
        String a = "how are you?";
        StringBuilder aEven = new StringBuilder("");
        System.out.println("First letter uppercase");
        String first = a.substring(0, 1).toUpperCase();
        System.out.println(first + a.substring(1));
        System.out.println("\n Even Uppercases:");
        for (int i=0; i<a.length();i++){
            if(i%2==0){
                aEven.append(Character.toUpperCase(a.charAt(i)));
            }
            else{
                aEven.append(a.charAt(i));
            }
        }
        System.out.println(aEven);
    }
}
