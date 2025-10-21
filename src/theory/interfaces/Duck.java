package theory.interfaces;

public class Duck implements Fly, Move, Eat{
    public void fly() {
        System.out.println("Duck flying");
    }
    public void move() {
        System.out.println("Duck move");
    }
    public void eat() {
        System.out.println("Duck eat");
    }
}
