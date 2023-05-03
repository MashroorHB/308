public class DairyCream extends CoffeeDecorator{
    Coffee coffee;

    public DairyCream(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public int getPrice() {
        return coffee.getPrice()+40;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+ ", dairy cream";
    }
}
