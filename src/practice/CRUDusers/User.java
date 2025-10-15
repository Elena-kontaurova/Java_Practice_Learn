package practice.CRUDusers;

public class User {
    public String name;
    public Integer age;
    public String gender;

    public User(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    @Override
    public String toString() {
        return name + " " + age + " " + gender;
    }
}
