package theory.interfacesSupport;

public class Beer implements Drink {
    public void drink() {
        System.out.println("Beer");
    }
    public String toString() {
        return "Beer";
    }
}
