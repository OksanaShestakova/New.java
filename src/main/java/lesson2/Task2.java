package lesson2;

public class Task2 {
    public static void main(String[] args) {
        Task2 summbetweenab = new Task2();
        summbetweenab.countsumm (10,12);
    }
    public void countsumm (int a, int b) {
       int c=0;
    while (a <= b) {
            c = a + c;
            a++;
        }
        System.out.println(c);
    }


}
