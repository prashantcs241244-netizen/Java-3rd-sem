package Lec_07;

public class Student {
    String name;
    int rollno;
    double marks;

  Student(String name, int rollno, double marks) {
       this.name = name;
       this.rollno = rollno;
       this.marks = marks;

    }

    void display_detail() {
        System.out.println("Name: " + name);
        System.out.println("Rollnumber: " + rollno);
        System.out.println("Marks: " + marks);
        System.out.println("-------------------");

    }

    public static void main(String[] args) {
        Student obj = new Student("prashant", 52, 60);
        Student obj1 = new Student("ravi", 68, 85);
        Student obj2 = new Student("avi", 70, 86);

        obj.display_detail();
        obj1.display_detail();
        obj2.display_detail();
    }
}
