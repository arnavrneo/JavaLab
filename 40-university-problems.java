package minor2;
import java.util.ArrayList;

class Student {
    private String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentName() {
        return studentName;
    }
}

class Batch {
    private String batchName;
    private ArrayList<Student> students;

    public Batch(String batchName) {
        this.batchName = batchName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getBatchName() {
        return batchName;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}

class Department {
    private String departmentName;
    private ArrayList<Batch> batches;

    public Department(String DepartmentName) {
        this.departmentName = DepartmentName;
        this.batches = new ArrayList<>();
    }

    public void addBatch(Batch batch) {
        batches.add(batch);
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public ArrayList<Batch> getBatches() {
        return batches;
    }
}

class Clg {
    private String collegeName;
    private ArrayList<Department> departments;
    public Clg(String collegeName) {
        this.collegeName = collegeName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public String getCollegeName() {
        return collegeName;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }
}


class University {
    private String uniName;
    private ArrayList<Clg> colleges;
    public University(String uniName) {
        this.uniName = uniName;
        this.colleges = new ArrayList<>();
    }

    public void addCollege(Clg college) {
        colleges.add(college);
    }

    public void displayUniDetails() {
        System.out.println("Event: " + uniName);
        for (Clg college : colleges) {
            System.out.println("College Name: " + college.getCollegeName());
            System.out.println("Departments:");
            for (Department department: college.getDepartments()) {
                System.out.println("- " + department.getDepartmentName());
                for (Batch batch: department.getBatches()) {
                    System.out.println("Batches: ");
                    System.out.println(" - " + batch.getBatchName());
                    for (Student student: batch.getStudents()) {
                        System.out.println("Students: ");
                        System.out.println("  - " + student.getStudentName());
                    }
                }
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Arnav");
        Student student2 = new Student("Tony");

        Batch batch1 = new Batch("A");
        batch1.addStudent(student1);

        Batch batch2 = new Batch("B");
        batch2.addStudent(student2);

        Department department1 = new Department("CSE");
        department1.addBatch(batch1);

        Department department2 = new Department("CS");
        department2.addBatch(batch2);

        Clg college1 = new Clg("Clg 1");
        college1.addDepartment(department1);

        Clg college2 = new Clg("Clg 2");
        college2.addDepartment(department2);

        University uni = new University("UNI group");
        uni.addCollege(college1);
        uni.addCollege(college2);

        uni.displayUniDetails();
    }
}
