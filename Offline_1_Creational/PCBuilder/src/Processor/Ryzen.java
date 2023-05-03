package Processor;

public class Ryzen extends Processor{
    public Ryzen(){
        name = "Ryzen 7 5700X";
        price = 28000;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
