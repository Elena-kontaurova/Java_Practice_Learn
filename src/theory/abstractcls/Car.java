package theory.abstractcls;

public class Car extends Transport {
    @Override
    public String getToplivo() {
        return "Бензин";
    }

    @Override
    public String theEnvironmentMovement() {
        return "Дорога";
    }
}
