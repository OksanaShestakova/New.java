package Lesson4;

import java.util.ArrayList;
import java.util.Collections;

public class ArList {
    public void createList() {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> namesNew = new ArrayList<>();
        names.add("Steve");
        names.add("Tim");
        names.add("Lucy");
        names.add("Steve");
        names.add("Pat");
        names.add("Angela");
        names.add("Tom");
        names.add("Tim");
        names.add("Anna");
        names.add("Lucy");
        Collections.sort(names);
        System.out.println(names);
        namesNew.add(names.get(0));
        int d = names.size();
        int p = 0;
        int i;
        for (i = 0; i < d; i++) {
            if (!(names.get(i).equals(namesNew.get(p)))) {
                namesNew.add(names.get(i));
                p = p + 1;
            }
        }
        System.out.println(namesNew);
    }


    }
