public class GrindedCoffeeBeans extends CoffeeDecorator{
    Coffee coffee;

    public GrindedCoffeeBeans(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public int getPrice() {
        return coffee.getPrice()+30;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+ ", grinded coffee beans";
    }
}
