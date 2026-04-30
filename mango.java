interface Mango {
    void taste();
}

class Winter implements Mango {
    public void taste() {
        System.out.println("Winter Mango");
    }
}

class Summer implements Mango {
    public void taste() {
        System.out.println("Summer Mango");
    }
}

class Main {
    public static void main(String[] args) {
        Mango m;
        m = new Winter(); m.taste();
        m = new Summer(); m.taste();
    }
}