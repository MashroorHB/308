package Processor;

public class CoreI5 extends Processor{
    public CoreI5(){
        name = "Intel Core i5";
        price = 20000;
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
