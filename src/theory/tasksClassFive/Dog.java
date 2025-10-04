package theory.tasksClassFive;

public class Dog {
    public String name;
    public Integer height;
    public String color;
    public Dog(String name, Integer height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }
    public static Dog init1(String name) {
        return new Dog(name, null, null);
    }
    public static Dog init2(String name, Integer height) {
        return new Dog(name, height, null);
    }
}
