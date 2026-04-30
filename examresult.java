interface Exam {
    void percent_cal();
}

class Student {
    int m1 = 80, m2 = 90;

    void show() {
        System.out.println("Marks: " + m1 + ", " + m2);
    }
}

class Result extends Student implements Exam {
    double per;

    public void percent_cal() {
        per = (m1 + m2) / 2.0;
    }

    void display() {
        System.out.println("Percentage: " + per);
    }
}

class Main {
    public static void main(String[] args) {
        Result r = new Result();
        r.show();
        r.percent_cal();
        r.display();
    }
}