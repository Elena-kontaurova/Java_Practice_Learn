package theory.workClass;

public class Dog {
    public String name;
    public Women owner;
    public Dog(String name, Women owner) {
        this.name = name;
        this.owner = owner;
    }
    @Override
    public String toString() {
        return name + " " + owner;
    }
}
