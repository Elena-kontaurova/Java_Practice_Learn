package theory.Polymorphism;

public class Test {
    public static void main(String[] args) {
        Cow cow = new Cow();
        Whale whale = new Whale();
        Cow cow1 = new Whale();
        System.out.println(check(cow));
        System.out.println(check(whale));
        System.out.println(check(cow1));

    }
    public static String check(Cow cow) {
        if (cow instanceof Whale) {
            return "while";
        }
        else if (cow instanceof Cow) {
            return "cow";
        }
        return "";
    }
}
