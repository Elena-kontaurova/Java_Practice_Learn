package theory.AnAbstractClass;

public abstract class Pet {
    public String name;
    public Integer age;

    public Pet(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public abstract void createChildren();
}
