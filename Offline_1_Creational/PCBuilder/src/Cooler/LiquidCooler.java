package Cooler;

public class LiquidCooler extends Cooler{

    public LiquidCooler(){
        name = "Liquid Cooler";
        price = 17000;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
