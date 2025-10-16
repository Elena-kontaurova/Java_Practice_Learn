package theory.Encapsulation;

//  Cat cc = new Cat("f", "f", "f", "f");
//  Dog dd = new Dog("df", 12, "sd", "sd");
//  cc.setName(dd.getName());


public class Dog {
    private String name;
    private int age;
    private String gender;
    private String tail;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Dog(String name, int age, String gender, String tail) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.tail = tail;
    }
    public String toString() {
        return name + " " + age + " " + gender + " " + tail;
    }
}
