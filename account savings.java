abstract class Account {
    double balance;

    abstract void deposit(double amt);
    abstract void withdraw(double amt);

    void display() {
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    double rate = 5;

    void deposit(double amt) { balance += amt; }
    void withdraw(double amt) { balance -= amt; }

    void calculateAmount() {
        balance += balance * rate / 100;
    }
}

class Main {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.deposit(1000);
        s.calculateAmount();
        s.display();
    }
}