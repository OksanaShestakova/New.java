package Lesson4;

import java.util.HashMap;

public class GetToyById {
    public static void methodGetToyById() {
        HashMap<Integer, String> toys = new HashMap<Integer, String>();
        toys.put(12, "Batmobile");
        toys.put(45, "Light Saber");
        toys.put(6, "Wonder Woman");
        toys.put(201, "Hello Kitty Bag");
        toys.put(56, "Junior QA Analyst Doll");
        Integer id = 48;
             if(!((toys.get(id)) ==null)){
        System.out.println(toys.get(id));}
      //  else System.out.println("No such Toy");
       }
}
