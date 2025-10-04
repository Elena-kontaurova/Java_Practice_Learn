package theory.tasksClassFive;

public class DogHome {
    public String name;
    public Integer height;
    public String color;
    public DogHome(String name, Integer height, String color) {
        this.name = name;
        this.height = height;
        this.color = color;
    }
    public static DogHome init1(String name) {
        return new DogHome(name, null, null);
    }
    public static DogHome init2(String name, Integer height) {
        return new DogHome(name, height, null);
    }
}
