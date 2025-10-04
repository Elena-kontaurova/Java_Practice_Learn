package theory.tasksClassFive;

public class testClassFive {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Dima", 19, 20, 100);
        Cat cat2 = new Cat("Bob", 21, 21, 100);
        Cat cat3 = new Cat("Jack", 22, 22, 100);
        boolean a = Cat.fight(cat1, cat2);
        boolean b = Cat.fight(cat2, cat3);
        boolean c = Cat.fight(cat3, cat1);
    }
}
