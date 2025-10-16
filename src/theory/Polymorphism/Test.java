package theory.Polymorphism;

public class Test {
    public static void main(String[] args) {
        Cow cow = new Cow();
        Whale whale = new Whale();
        Cow cow1 = new Whale();
        check(cow);
        check(whale);
        check(cow1);
    }
    public static void check(Cow cow) {
        if (cow instanceof Whale) {
            System.out.println("whale");
        }
        else if (cow instanceof Cow) {
            System.out.println("cow");
        }
    }
}
