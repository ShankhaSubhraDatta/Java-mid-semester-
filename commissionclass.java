import java.util.*;

class Commission {
    double sales;

    Commission(double s) {
        if (s < 0) {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        sales = s;
    }

    double commission() {
        return sales * 0.1;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s = sc.nextDouble();

        Commission c = new Commission(s);
        System.out.println("Commission = " + c.commission());
    }
}