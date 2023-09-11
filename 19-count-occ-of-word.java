public class Main {
    public static void main(String[] args){
        String string = String.join(" ", args);
        String word = "is";
        String temp[] = String.split("");
        int count=0;
        for(int i=0;i<temp.length;i++){
            if(word.equals(temp[i])){
                count++;
            }
        }
        System.out.println("Word occured" + count + "times in the string");
    }
}
