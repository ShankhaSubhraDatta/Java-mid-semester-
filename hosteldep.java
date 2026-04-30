import java.util.*;

interface Department {
    void printDept();
}

class Hostel {
    String hostelName;

    void getHostel() {
        Scanner sc = new Scanner(System.in);
        hostelName = sc.next();
    }
}

class Student extends Hostel implements Department {
    String name;
    int regNo;

    void getData() {
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        regNo = sc.nextInt();
        getHostel();
    }

    public void printDept() {
        System.out.println("Student: " + name + " RegNo: " + regNo);
        System.out.println("Hostel: " + hostelName);
    }
}

class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.getData();
        s.printDept();
    }
}