package Car;

import Color.*;
import Country.*;
import DriveTrain.*;
import Engine.*;

public class Toyota implements Car{
    private String name;
    private Color color;
    private Country country;
    private Engine engine;
    private DriveTrain driveTrain;

    public String getName() {
        name = "Toyota";
        return name;
    }

    public Color getColor() {
        color = new Red();
        return color;
    }

    public Country getCountry() {
        country = new Japan();
        return country;
    }

    public Engine getEngine() {
        engine = new HydrogenFuelCell();
        return engine;
    }

    public DriveTrain getDriveTrain() {
        driveTrain = new RearWheel();
        return driveTrain;
    }

    @Override
    public void show() {
        System.out.println("Name of the Brand: " + getName() + "\n"+
                "Color: " + getColor().getColor() + " \n"+
                "Country of Manufacture: " + getCountry().getCountry() + " \n"+
                "Engine Type: " + getEngine().getEngine() + " \n"+
                "Drive Train Type: " + getDriveTrain().getDriveTrain() + " \n");
    }
}
