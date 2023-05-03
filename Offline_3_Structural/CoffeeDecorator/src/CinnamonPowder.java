public class CinnamonPowder extends CoffeeDecorator{
    Coffee coffee;

    public CinnamonPowder(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public int getPrice() {
        return coffee.getPrice()+50;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+ ", cinnamon powder";
    }
}
