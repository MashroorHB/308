package Processor;

public class CoreI9 extends Processor{
    public CoreI9(){
        name = "Intel Core i9";
        price = 65000;
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
