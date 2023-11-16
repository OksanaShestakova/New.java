package Lesson4;

import java.util.ArrayList;

public class Other {
    public static void methodDouble() {
        ArrayList<String> doubleList = new ArrayList<String>();
        doubleList.add("2");
        doubleList.add("2");
        doubleList.add("1");
        int m = doubleList.size();
        for (int i = 0; i <= m; i++) {
            if (doubleList.get(i).equals("2") && doubleList.get(i + 1).equals("2")) {
                System.out.println("2.True");
                break;
            }
            if (!(doubleList.get(i).equals("2") && doubleList.get(i + 1).equals("2"))) {
                System.out.println("2.False");
                ;
            }
        }
    }

    public boolean contain13() {
        boolean answer = true;
        ArrayList<String> count = new ArrayList<>();
        count.add("2");
        count.add("8");
        count.add("3");
        int v = count.size();
        for (int k = 0; k <= v - 1; k++) {
            if (count.get(k).equals("1") || count.get(k).equals("3")) {
                answer = false;
                break;
            }
//        else {   answer=true;;}}
        }
        System.out.println("3. " + answer);
        return answer;
    }

    public void nech() {
        ArrayList<String> chisla = new ArrayList<>();
        chisla.add("3");
        chisla.add("9");
        chisla.add("8");
        chisla.add("3");
        chisla.add("7");
        int dlina = chisla.size();
        if (!(dlina % 2 == 0)) {
            int perv = Integer.parseInt(chisla.get(0));
            int posl = Integer.parseInt(chisla.get(dlina - 1));
            int sr = Integer.parseInt(chisla.get(Math.round(dlina / 2)));
            int max1 = Math.max(perv, posl);
            int max2 = Math.max(max1, sr);
            System.out.println("4.max chislo" + max2);
        }

    }

    public boolean vozvrat() {
        boolean reshenie = false;
        ArrayList<String> listvozvrat = new ArrayList<>();
        listvozvrat.add("9");
        listvozvrat.add("4");
        // listvozvrat.add("2");
        // listvozvrat.add("2");
        // listvozvrat.add("1");

        int dlinamas = listvozvrat.size();

        if (dlinamas >= 4) {
            for (int i = 0; i <= 3; i++) {
                if (listvozvrat.get(i).equals("9")) {
                    reshenie = true;
                }
            }
        } else {
            int om;
            for (om = 0; om <= (listvozvrat.size() - 1); om++) {
                if (listvozvrat.get(om).equals("9")) {
                    reshenie = true;
                }
            }
        }

        System.out.println("5. " + reshenie);
        return reshenie;
    }
    public static void square(){
        ArrayList <Integer> ymnoz = new ArrayList<>();
        ArrayList <String> ymnoznew = new ArrayList<>();
        ymnoz.add(6);
        ymnoz.add(1);
        ymnoz.add(7);
        ymnoz.add(5);
        int dl= ymnoz.size();
        for (int s=0; s<=dl-1; s++ ){
          ymnoznew.add(String.valueOf((ymnoz.get(s))*(ymnoz.get(s))));
        }
        System.out.println("6. "+ ymnoznew);
    }

}




