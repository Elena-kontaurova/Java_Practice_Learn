package theory.interfacesSupport;

public class Test {
    public static void main(String[] args) {
        AlcoholicBeer beer = new AlcoholicBeer();
        beer.drink();

        Cola cola = new Cola();
        cola.drink();

        Beer beer1 = new Beer();
        beer1.drink();
    }
}
