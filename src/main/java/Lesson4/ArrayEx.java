package Lesson4;


import java.util.HashMap;

public class ArrayEx {
    public void hashMapDays() {
        HashMap<String, String> days = new HashMap<String, String>();
        days.put("1", "Sunday");
        days.put("2", "Monday");
        days.put("3", "Tuesday");
        days.put("4", "Wednesday");
        days.put("5", "Thursday");
        days.put("6", "Friday");
        days.put("7", "Saturday");
        System.out.println(days.get("4"));


    }
}
