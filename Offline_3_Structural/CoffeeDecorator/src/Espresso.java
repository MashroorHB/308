public class Espresso{
    private Coffee coffee;
    public Espresso(){
        coffee = new BlackCoffee();
        coffee = new DairyCream(coffee);
    }
    Coffee getCoffee() {
        return coffee;
    }
}
