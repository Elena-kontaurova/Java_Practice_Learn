package theory.polymorphism;

public class Whale extends Cow{
    public void getName() {
        System.out.println("Я не корова, Я - кит");
    }
    public Whale getChild() {
        return new Whale();
    }
    public String toString() {
        return "Whale";
    }
}
