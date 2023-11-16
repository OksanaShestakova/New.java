package lesson2;

public class Other {
    public static void main(String[] args) {
        Other countost = new Other();
        countost.vichisli(57, 47);
        countost.maxChislo(78, 78, 78);
    }

    public void vichisli(int a, int b) {
        if (a % 10 == b % 10) {
            System.out.println("lastDigit(" + a + "," + b + ") → true");
        } else {
            System.out.println("lastDigit(" + a + " " + b + ") → false");
        }

    }

    public void maxChislo(int i, int j, int c) {
        int max = 0;
        if (i >= j & i > c) {
            max = i;
        }
        if (j > i & j >= c) {
            max = j;
        }
        if (c >= i & c > i) {
            max = c;
        }
        if (c ==i & c ==j) {
            max = c;}
        System.out.println("Max" + max);
    }
}
