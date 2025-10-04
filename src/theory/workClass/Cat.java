package theory.workClass;

public class Cat {
    private String name;
    public int age;
    public Women owner;
    public Cat(String name, int age, Women owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
        Cat.addNewCat();
    }
    @Override
    public String toString() {
        return name + " " + age + " " + owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static int catsCount = 0;
    public static void addNewCat() {
        catsCount++;
    }

    public static int getCatsCount() {
        return catsCount;
    }

    private static int catsCount1 = 0;
    public static void setCatsCount(int catsCount) {
        Cat.catsCount1 = catsCount;
    }

    public static int getCount1() {
        return catsCount1;
    }

    private String fullName;
    public void setName(String firstName, String lastName) {
        this.fullName = firstName + lastName;
    }

    public String getFullName() {
        return fullName;
    }
}
