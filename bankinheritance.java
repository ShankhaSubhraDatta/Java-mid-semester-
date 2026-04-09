// Bank Interface
interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
    void displayBalance();
}

// Customer Class
class Customer {
    String name;
    int customerId;

    Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    void showCustomer() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + customerId);
    }
}

// Account Class
class Account {
    int accountNo;
    double balance;

    Account(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    void showAccount() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Balance: " + balance);
    }
}

// Final Class implementing multiple inheritance concept
class BankSystem extends Customer implements Bank {
    Account acc;

    BankSystem(String name, int customerId, int accountNo, double balance) {
        super(name, customerId);
        acc = new Account(accountNo, balance);
    }

    // Implement Bank interface methods
    public void deposit(double amount) {
        acc.balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= acc.balance) {
            acc.balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + acc.balance);
    }

    void displayAll() {
        showCustomer();
        acc.showAccount();
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        BankSystem b = new BankSystem("Shankha", 101, 5001, 10000);

        b.displayAll();
        b.deposit(2000);
        b.withdraw(1500);
        b.displayBalance();
    }
}