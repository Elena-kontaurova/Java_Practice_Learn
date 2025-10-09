package theory;

import java.util.*;

public class LinkedListHashSetHashMapDate {
    public static void main(String[] args) {
        hashMap();
    }
    public static void hastSet() {
        HashSet<String> set = new HashSet<>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("еживика");
        set.add("жень-шень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");
        for (String s : set) {
            System.out.println(s);
        }
    }
    public static void hashMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Арбуз", "ягода");
        map.put("Банан", "трава");
        map.put("Вишня", "ягода");
        map.put("Груша", "фрукт");
        map.put("Дыня", "овощ");
        map.put("Ежевика", "куст");
        map.put("Жень-шень", "корень");
        map.put("Земляника", "ягода");
        map.put("Ирис", "цветок");
        map.put("Картофель", "клубень");

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
