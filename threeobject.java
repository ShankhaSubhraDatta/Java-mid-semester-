abstract class ThreeDObject {
    abstract double volume();
    abstract double surfaceArea();
}

class Box extends ThreeDObject {
    double l, b, h;
    Box(double l, double b, double h) {
        this.l = l; this.b = b; this.h = h;
    }
    double volume() { return l*b*h; }
    double surfaceArea() { return 2*(l*b + b*h + h*l); }
}

class Cube extends ThreeDObject {
    double a;
    Cube(double a) { this.a = a; }
    double volume() { return a*a*a; }
    double surfaceArea() { return 6*a*a; }
}

class Cylinder extends ThreeDObject {
    double r, h;
    Cylinder(double r, double h) { this.r = r; this.h = h; }
    double volume() { return 3.14*r*r*h; }
    double surfaceArea() { return 2*3.14*r*(r+h); }
}

class Main {
    public static void main(String[] args) {
        ThreeDObject obj;

        obj = new Box(2,3,4);
        System.out.println("Box Volume: " + obj.volume());

        obj = new Cube(3);
        System.out.println("Cube Area: " + obj.surfaceArea());

        obj = new Cylinder(2,5);
        System.out.println("Cylinder Volume: " + obj.volume());
    }
}