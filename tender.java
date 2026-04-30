import java.util.*;

class Tender {
    double cost;
    String name;

    void input() {
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        cost = sc.nextDouble();
    }
}

class Main {
    public static void main(String[] args) {
        Tender[] t = new Tender[5];
        int minIndex = 0;

        for (int i = 0; i < 5; i++) {
            t[i] = new Tender();
            t[i].input();
        }

        for (int i = 1; i < 5; i++) {
            if (t[i].cost < t[minIndex].cost)
                minIndex = i;
        }

        System.out.println("Lowest cost company: " + t[minIndex].name);
    }
}