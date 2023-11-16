package lesson2;

public class Task3 {
    public static void main(String[] args) {
        Task3 asterisk = new Task3();
        asterisk.numbersTemplate(8);
        asterisk.near100(115);
    }

    public void numbersTemplate(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void near100(int a) {
        if (a >= 90 & a <= 100) {
            System.out.println("nearHundred(" + a + ") → true");
        } else {
            System.out.println("nearHundred(" + a + ") → false");
        }
    }

}
