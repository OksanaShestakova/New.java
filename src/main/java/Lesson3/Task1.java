package Lesson3;

public class Task1 {
    public static void main(String[] args) {
        Task1 writeString = new Task1();
        writeString.compareStrings("", "yyyyyh");
    }

    public void compareStrings(String a, String b) {
        String wordisnull = " Cannot compare Strings ";
        if (a == null || b == null) {
            System.out.println(wordisnull);
        }
        String word1 = a.toLowerCase();
        String word2 = b.toLowerCase();
        if (word1.contains(word2) && (!(word1.length() == word2.length() || word2.length() == 0 || word1.length() == 0))) {
            System.out.println(b + " is the part of " + a);
        }
        if (!word1.contains(word2) || word1.isEmpty() || word2.isEmpty() || word1.isBlank() || word1.isBlank()) {
            System.out.println(b + " is NOT the part of " + a);
        }
        if (word1.equals(word2) && (word1.length() == word2.length())) {
            System.out.println(" The Strings are the same ");
        }
    }
}


