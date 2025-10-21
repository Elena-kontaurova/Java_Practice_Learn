package theory.methodOverloadingFeatureCallingConstructors;

public class Test {
    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        System.out.println(dragon.getSize());
        Goose goose = new Goose();

        Ferrari ferrari = new Ferrari();
        System.out.println(ferrari.printlnDesire());
    }
}
