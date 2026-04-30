interface SalesDepartment {
    void processSale(double amount);
}

interface FinanceDepartment {
    void generateInvoice(String name, double amount);
}

class CommercialExecutive implements SalesDepartment, FinanceDepartment {

    public void processSale(double amount) {
        System.out.println("Sale processed: " + amount);
    }

    public void generateInvoice(String name, double amount) {
        System.out.println("Invoice for " + name + " Amount: " + amount);
    }

    void showSummary() {
        System.out.println("Work Completed");
    }
}

class Main {
    public static void main(String[] args) {
        CommercialExecutive c = new CommercialExecutive();
        c.processSale(5000);
        c.generateInvoice("ClientA", 5000);
        c.showSummary();
    }
}