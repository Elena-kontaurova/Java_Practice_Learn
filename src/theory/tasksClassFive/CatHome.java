package theory.tasksClassFive;

public class CatHome {
    public String name;
    public Integer age;
    public Integer weight;
    public String color;
    public String address;
    public CatHome(String name, Integer age, Integer weight, String color, String address) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
    public static CatHome init1(String name) {
        return new CatHome(name, null, null, null, null);
    }
    public static CatHome init2(String name, Integer weight, Integer age) {
        return new CatHome(name, age, weight, null, null);
    }
    public static CatHome init3(String name, Integer age) {
        int weight = 10;
        return new CatHome(name, age, weight, null, null);
    }
    public static CatHome init4(Integer weight, String color) {
        return new CatHome(null, null, weight, color, null);
    }
    public static CatHome init5(Integer weight, String color, String address) {
        return new CatHome(null, null, weight, color, address);
    }
}
