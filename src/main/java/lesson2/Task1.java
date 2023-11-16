package lesson2;

public class Task1 {
    public static void main(String[] args) {
        int i = 0;
        for (i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println("The number " + i + " is divisible by three");
            } else if (i % 2 == 0) {
                System.out.println("The number " + i + " is odd");
            } else {
                System.out.println("The number " + i + " even");
            }
            if (i % 2 == 0 & i % 3 == 0) {
                System.out.println("The number " + i + " is divisible by three and two");
            }

        }
    }
}

