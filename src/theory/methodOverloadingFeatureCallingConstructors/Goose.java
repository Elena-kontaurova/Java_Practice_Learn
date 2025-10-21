package theory.methodOverloadingFeatureCallingConstructors;

public class Goose extends SmallAnimal {
    public String getSize() {
        return  "Гусь маленький, " + super.getSize();
    }
}
