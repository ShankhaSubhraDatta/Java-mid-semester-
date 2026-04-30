class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Circle {
    Point p;
    double r;

    Circle(int x, int y, double r) {
        p = new Point(x, y);
        this.r = r;
    }

    void display() {
        double area = 3.14 * r * r;
        System.out.println("Center: (" + p.x + "," + p.y + ")");
        System.out.println("Radius: " + r);
        System.out.println("Area: " + area);
    }
}

class Main {
    public static void main(String[] args) {
        Circle c = new Circle(2, 3, 5);
        c.display();
    }
}