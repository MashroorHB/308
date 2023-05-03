public class Milk extends CoffeeDecorator{
    Coffee coffee;

    public Milk(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public int getPrice() {
        return coffee.getPrice()+50;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+ ", milk";
    }
}
