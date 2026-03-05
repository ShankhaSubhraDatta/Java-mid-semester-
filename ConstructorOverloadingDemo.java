class Student {
    int id;
    String name;
    int age;

    // Constructor with no parameters
    Student() {
        id = 0;
        name = "Unknown";
        age = 0;
    }

    // Constructor with two parameters
    Student(int i, String n) {
        id = i;
        name = n;
    }

    // Constructor with three parameters
    Student(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println("ID: " + id + " Name: " + name + " Age: " + age);
    }
}

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(101, "Rahul");
        Student s3 = new Student(102, "Aman", 20);

        s1.display();
        s2.display();
        s3.display();
    }
}