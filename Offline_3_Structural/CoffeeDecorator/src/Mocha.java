public class Mocha{
    private Coffee coffee;
    public Mocha(){
        coffee = new MilkCoffee();
        coffee = new ChocolateSauce(coffee);
    }
    Coffee getCoffee() {
        return coffee;
    }
}
