package theory.tasksClassFive;

import static java.lang.Math.sqrt;

public class Rectangle {
    public Integer top;
    public Integer left;
    public Integer width;
    public Integer height;
    public Rectangle(Integer top, Integer left, Integer width, Integer height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public static Rectangle init1(Integer top, Integer left, Integer width, Integer height) {
        return new Rectangle(top, left, width, height);
    }
    public static Rectangle init2(Integer top, Integer left) {
        return new Rectangle(top, left, null, null);
    }
    public static Rectangle init3(Integer top, Integer left, Integer height) {
        Integer width = height;
        return new Rectangle(top, left, width, height);
    }
    public static Rectangle init4(Rectangle rectangle) {
        Integer top = rectangle.top;
        Integer left = rectangle.left;
        Integer width = rectangle.width;
        Integer height = rectangle.height;
        return new Rectangle(top, left, width, height);
    }
}
