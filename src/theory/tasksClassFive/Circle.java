package theory.tasksClassFive;

public class Circle {
    public int centerX;
    public int centerY;
    public int radius;
    public Integer width;
    public String color;

    public Circle(int centerX, int centerY, int radius, Integer width, String color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }

    public static Circle init1(int centerX, int centerY, int radius) {
        return new Circle(centerX, centerY, radius, null, null);
    }

    public static Circle init2(int centerX, int centerY, int radius, Integer width) {
        return new Circle(centerX, centerY, radius, width, null);
    }
}
