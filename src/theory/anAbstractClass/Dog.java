package theory.anAbstractClass;

public class Dog extends Pet{
    public Dog(String name, Integer age) {
        super(name, age);
    }

    @Override
    public void createChildren() {
        System.out.println("Dog");
    }
    public String toString() {
        return name + " " + age;
    }
}
