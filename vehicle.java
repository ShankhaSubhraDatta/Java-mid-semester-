abstract class MotorVehicle {
    String name;
    int number;
    double price;

    MotorVehicle(String n, int num, double p) {
        name = n; number = num; price = p;
    }

    abstract void display();
}

class Car extends MotorVehicle {
    double discountRate = 10;

    Car(String n, int num, double p) {
        super(n, num, p);
    }

    void display() {
        double discount = price * discountRate / 100;
        System.out.println(name + " " + number + " Price: " + price);
        System.out.println("Discount: " + discount);
    }
}

class Main {
    public static void main(String[] args) {
        Car c = new Car("BMW", 101, 50000);
        c.display();
    }
}