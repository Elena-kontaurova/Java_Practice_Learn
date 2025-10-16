package theory.Polymorphism;

public class Cow {
    public void getName()
    {
        System.out.println("Я – корова");
    }
    public Cow getChild() {
        return new Cow();
    }
    public String toString() {
        return "Cow";
    }
}
