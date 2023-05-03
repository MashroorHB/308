package Car;

import Color.*;
import Country.*;
import DriveTrain.*;
import Engine.*;

public class Tesla implements Car{
    private String name;
    private Color color;
    private Country country;
    private Engine engine;
    private DriveTrain driveTrain;

    public String getName() {
        name = "Tesla";
        return name;
    }

    public Color getColor() {
        color = new White();
        return color;
    }

    public Country getCountry() {
        country = new US();
        return country;
    }

    public Engine getEngine() {
        engine = new Electric();
        return engine;
    }

    public DriveTrain getDriveTrain() {
        driveTrain = new AllWheel();
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
