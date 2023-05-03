public class Cappuccino{
    private Coffee coffee;
    public Cappuccino(){
        coffee = new MilkCoffee();
        coffee = new CinnamonPowder(coffee);
    }
    Coffee getCoffee() {
        return coffee;
    }
}
