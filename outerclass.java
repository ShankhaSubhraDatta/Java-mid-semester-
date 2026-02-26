class Outer {

    int outerData = 10;   // Data member of outer class

    // Inner class
    class Inner {
        void display() {
            System.out.println("Outer data is: " + outerData);
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args) {

        // Create outer class object
        Outer outerObj = new Outer();

        // Create inner class object using outer class object
        Outer.Inner innerObj = outerObj.new Inner();

        // Call inner class method
        innerObj.display();
    }
}