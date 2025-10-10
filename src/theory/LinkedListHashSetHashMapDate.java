package theory;

import java.util.*;

public class LinkedListHashSetHashMapDate {
    public static void main(String[] args) {
        setL();
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
    public static void efficiency() {
        long start = System.currentTimeMillis();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 100000; i ++) {
            list.add("a");
            list.add(1, "s");
            String a = list.getFirst();
            list.set(0, "b");
            list.removeFirst();
        }
        long end = System.currentTimeMillis();
        long result = (end - start);
        System.out.println(result);
    }
    public static void efficiency1() {
        long start = System.currentTimeMillis();
        LinkedList<String> list1 = new LinkedList<>();
        for (int i = 0; i < 100000; i ++) {
            list1.add("a");
            list1.add(1, "s");
            String a = list1.getFirst();
            list1.set(0, "b");
            list1.removeFirst();
        }
        long end = System.currentTimeMillis();
        long result = (end - start);
        System.out.println(result);
    }
    public static void setL() {
        Set<String> set = new HashSet<>();
        set.add("лох");
        set.add("лук");
        set.add("лик");
        set.add("лом");
        set.add("лоб");
        set.add("ласт");
        set.add("ласточка");
        set.add("лист");
        set.add("лимон");
        set.add("ленок");
        set.add("люмен");
        set.add("лазертаг");
        set.add("лабуба");
        set.add("лучница");
        set.add("листовка");
        set.add("ластик");
        set.add("лука");
        set.add("лида");
        set.add("лариса");
        set.add("лалаленд");
        for (String s : set) {
            System.out.println(s);
        }
    }
}
