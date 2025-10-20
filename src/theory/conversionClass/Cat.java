package theory.conversionClass;

public class Cat {
    private String name;
    private Cat(String key) {
        name = key;
    }
    public static Cat getCatByKey(String key) {
       return new Cat(key);
    }
    public String toString() {
        return name;
    }
}
