class OuterClass {
    int x = 4;
    class InnerClass {
        public void show() {
            System.out.println(x);
        }
     }

     static class InnerStaticClass {
        int y = 6;
        public void show() {
            System.out.println(y);
        }
     }
}
public class InnerClasses {
    public static void main(String[] args) {
        OuterClass a = new OuterClass();
        OuterClass.InnerClass b = a.new InnerClass();
        b.show(); // non-static inner class

        OuterClass.InnerStaticClass c = new OuterClass.InnerStaticClass();
        c.show(); // static inner class

    }
}
