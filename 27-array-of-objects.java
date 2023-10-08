class Students {
    private String name;
    private int roll;

    Students(String nameS, int rollS) {
        this.name = nameS;
        this.roll = rollS;
    }

    public void get() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
    }
}

public class ObjectsArray {
    public static void main(String[] args) {
        Students[] arr = new Students[3];

        arr[0] = new Students("Arnav", 19);
        arr[1] = new Students("Billie", 29);
        arr[2] = new Students("Chris", 32);

        for (Students a: arr)
            a.get();
    }
}
