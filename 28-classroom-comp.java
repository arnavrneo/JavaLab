class Student {
    private int strength;

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int val) {
        this.strength = val;
    }
}

class Chairs {
    private int total;
    public int getTotal() {
        return this.total;
    }

    public void setTotal(int val) {
        this.total = val;
    }
}

class Classroom {
    private Student student;
    private Chairs chairs;

    Classroom() {
        this.student = new Student();
        this.chairs = new Chairs();
        student.setStrength(100);
        chairs.setTotal(110);
    }

    public int getStrength() {
        return student.getStrength();
    }

    public int getChairs() {
        return chairs.getTotal();
    }
}

public class ClassroomComp {
    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        System.out.println("Classroom Strength: " + classroom.getStrength());
        System.out.println("Total Chairs: " + classroom.getChairs());
    }
}
