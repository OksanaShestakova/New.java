package Lesson3;

public class Task2 {
    public static void main(String[] args) {
        Task2 writePalindrome = new Task2();
        boolean answer = writePalindrome.isPalindrome("addaw");
        System.out.println(answer);
        writePalindrome.axStart("iax");
    }

    public boolean isPalindrome(String word) {
        boolean answer = false;
        String result = "";
        word = word.toLowerCase();
        //if (!(word.isBlank())) ;
        // {
        int lastlet = word.length() - 1;
        for (int i = lastlet; i >= 0; i--) {
            result = result + word.charAt(i);
        }
        if (word.equals(result)) {
            answer = true;
        }
        if (word.isBlank()) {
            answer = false;
        }
        else {
            answer = false;
        }
        return answer;
    }
    public boolean axStart(String stroka) {
        boolean fank = false;
        String d = String.valueOf(stroka.charAt(3));
        if (!(stroka.isBlank())) {
            ;
            String a = String.valueOf(stroka.charAt(1));
            String b = String.valueOf(stroka.charAt(2));
            String c = a.concat(b);
            if (c.contains("ax")) {
                System.out.println("2.true");
                fank = true;
            }
        } else {
            System.out.println("2.false");
        }
        return fank;
    }
}


