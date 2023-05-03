public class ChocolateSauce extends CoffeeDecorator{
    Coffee coffee;

    public ChocolateSauce(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public int getPrice() {
        return coffee.getPrice()+60;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+ ", chocolate sauce";
    }
}
