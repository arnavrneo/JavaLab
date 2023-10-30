interface X {
    void getX();
}

interface Y {
    void getY();
}

class MultipleInterfaces implements X, Y{
    public void getX() {
        System.out.println("I'm X");
    }

    public void getY() {
        System.out.println("I'm Y");
    }
}

public class multipleInterfaces {
    public static void main(String[] args) {
        MultipleInterfaces x = new MultipleInterfaces();
        x.getX();
        x.getY();
    }
}
