package theory.interfaces;

public class Dog implements Move, Eat{
    public void eat() {
        System.out.println("Dog eat");
    }
    public void move() {
        System.out.println("Dog move");
    }
}
