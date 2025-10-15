package theory.Inheritance;

public class Pegas extends Horse{
    public String wings;
    public Pegas(String name, String hooves, String tail, String mane, String wings) {
        super(name, hooves, tail, mane);
        this.wings = wings;
    }
    @Override
    public String toString() {
        return name + " " + hooves + " " + tail + " " + mane + " " + wings;
    }
}
