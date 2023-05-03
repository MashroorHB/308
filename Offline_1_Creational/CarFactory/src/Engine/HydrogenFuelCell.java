package Engine;

public class HydrogenFuelCell implements Engine{
    private String engine;
    @Override
    public String getEngine() {
        engine = "Hydrogen Fuel Cell";
        return engine;
    }
}
