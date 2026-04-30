import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int upper = 0, lower = 0, digit = 0, space = 0;

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) upper++;
            else if (Character.isLowerCase(c)) lower++;
            else if (Character.isDigit(c)) digit++;
            else if (c == ' ') space++;
        }

        System.out.println("Upper: " + upper);
        System.out.println("Lower: " + lower);
        System.out.println("Digits: " + digit);
        System.out.println("Spaces: " + space);
    }
}