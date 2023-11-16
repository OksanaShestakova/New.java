package Lesson3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Other {
    public static void main(String[] args) {
        Other chars = new Other();
        chars.addChars("");
        chars.fuzz("ondb");
        chars.bib("fggbbat");
        chars.stringTimes("yu", "");
        chars.isPlural ("Kieysyujk");
    }

    public String addChars(String str) {
        String result = "";
        if (!str.isBlank()) {
            char last = str.charAt(str.length() - 1);
            result = last + str + last;
            System.out.println(result);
        } else System.out.println("1.bykva ili slovo otsytstvyet");
        return result;
    }

    public void fuzz(String st) {
        String k = st.toLowerCase();
        String posl = String.valueOf(k.charAt((st.length() - 1)));
        String perv = String.valueOf(k.charAt(0));
        if (!k.isBlank()) {
            if (posl.equals("b") && !(perv.equals("f"))) {
                System.out.println("Buzz");
            }
            if (perv.equals("f") && !(posl.equals("b"))) {
                System.out.println("Fizz");
            }
            if (perv.equals("f") && posl.equals("b")) {
                System.out.println("FizzBuzz");
            } else if (!(perv.equals("f")) && !(posl.equals("b"))) {
                System.out.println(st);
            }
        } else System.out.println("is blank");
    }

    public void bib(String w) {
        String nov = String.valueOf(w);
        Pattern pat = Pattern.compile(".*b.b.*");
        Matcher matcher = pat.matcher(nov);
        if (matcher.find()) {
            System.out.println("3.true");
        } else {
            System.out.println("3.False");
        }
    }

    public String stringTimes(String what, String how) {
        System.out.print("4.");
        if (how.isBlank() == false) {
            int howch = Integer.parseInt(how);
            if (howch >= 0 && what.isBlank() == false) {

                for (int i = 0; i < howch; i++) {
                    System.out.print(what);
                }
            }
        } else {
            System.out.print("otsytstvyet slovo ili chislo");
        }
        return how;
    }

    public void isPlural(String slovo){
        char lb=slovo.charAt(slovo.length()-1);
        String l =String.valueOf(lb);
        if ( l.equals("s")){
            System.out.println();
        System.out.println("5.True");}
        else { System.out.println();
            System.out.println("5.False");}
    }
}




