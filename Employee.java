// Interface
interface Gross {
    void calcGross();
}

// Employee Class
class Employee {
    String name;
    int empId;

    Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    void showEmployee() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
    }
}

// Salary Class
class Salary {
    double basic, da, hra;

    Salary(double basic, double da, double hra) {
        this.basic = basic;
        this.da = da;
        this.hra = hra;
    }
}

// Final Class implementing multiple inheritance
class PaySlip extends Employee implements Gross {
    Salary s;
    double gross;

    PaySlip(String name, int empId, double basic, double da, double hra) {
        super(name, empId);
        s = new Salary(basic, da, hra);
    }

    // Implement interface method
    public void calcGross() {
        gross = s.basic + s.da + s.hra;
    }

    void display() {
        showEmployee();
        System.out.println("Basic Salary: " + s.basic);
        System.out.println("DA: " + s.da);
        System.out.println("HRA: " + s.hra);
        System.out.println("Gross Salary: " + gross);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        PaySlip p = new PaySlip("Shankha", 201, 20000, 5000, 3000);

        p.calcGross();
        p.display();
    }
}