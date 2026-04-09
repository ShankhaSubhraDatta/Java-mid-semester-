// Interface
interface Exam {
    void Percent_cal();
}

// Student class
class Student {
    String name;
    int roll_no;
    int marks1, marks2;

    // Constructor
    Student(String name, int roll_no, int marks1, int marks2) {
        this.name = name;
        this.roll_no = roll_no;
        this.marks1 = marks1;
        this.marks2 = marks2;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
    }
}

// Result class
class Result extends Student implements Exam {
    float per;

    // Constructor
    Result(String name, int roll_no, int marks1, int marks2) {
        super(name, roll_no, marks1, marks2);
    }

    // Implement interface method
    public void Percent_cal() {
        per = (marks1 + marks2) / 2.0f;
    }

    void display() {
        show(); // from Student
        System.out.println("Percentage: " + per + "%");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Result r = new Result("Shankha", 101, 85, 90);

        r.Percent_cal();
        r.display();
    }
}