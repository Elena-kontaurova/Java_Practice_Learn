package theory.Encapsulation;

public class Cat {
    private String name;
    private String hooves;
    private String tail;
    private String mane;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Cat(String name, String hooves, String tail, String mane) {
        this.name = name;
        this.hooves = hooves;
        this.tail = tail;
        this.mane = mane;
    }
    public String toString() {
        return name + " " + hooves + " " + tail + " " + mane;
    }
}
