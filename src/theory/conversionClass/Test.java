package theory.conversionClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key = null;
        ArrayList<Cat> loc = new ArrayList<>();
        while (!"".equals(key)) {
            key = reader.readLine();
            Cat cat = Cat.getCatByKey(key);
            if (!cat.toString().isEmpty()) {
                loc.add(cat);
            }
        }
        for (Cat d: loc) {
            System.out.println(d);
        }
    }
}
