public class Americano{
    private Coffee coffee;
    public Americano(){
        coffee = new BlackCoffee();
        coffee = new GrindedCoffeeBeans(coffee);
    }
    Coffee getCoffee() {
        return coffee;
    }
}
