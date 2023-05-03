package Processor;

public class CoreI7 extends Processor{
    public CoreI7(){
        name = "Intel Core i7";
        price = 37000;
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
