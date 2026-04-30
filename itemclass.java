import java.util.*;

class Item {
    int code;
    double price;

    void input() {
        Scanner sc = new Scanner(System.in);
        code = sc.nextInt();
        price = sc.nextDouble();
    }

    void display() {
        System.out.println(code + "\t" + price);
    }
}

class Main {
    public static void main(String[] args) {
        Item[] obj = new Item[5];
        double total = 0;

        for (int i = 0; i < 5; i++) {
            obj[i] = new Item();
            obj[i].input();
            total += obj[i].price;
        }

        System.out.println("Code\tPrice");
        for (Item i : obj) i.display();

        System.out.println("Total = " + total);
    }
}