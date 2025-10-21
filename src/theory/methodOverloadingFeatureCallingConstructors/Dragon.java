package theory.methodOverloadingFeatureCallingConstructors;

public class Dragon extends BigAnimal {
    public String getSize() {
        return  "Дракон большой, " + super.getSize();
    }
}
