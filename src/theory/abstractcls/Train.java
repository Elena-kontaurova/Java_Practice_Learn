package theory.abstractcls;

public class Train extends Transport{
    @Override
    public String getToplivo() {
        return "Электичество";
    }

    @Override
    public String theEnvironmentMovement() {
        return "Рельсы";
    }
}
