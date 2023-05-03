package Cooler;

public class CPUCooler extends Cooler{

    public CPUCooler(){
        name = "CPU Cooler";
        price = 36000;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
