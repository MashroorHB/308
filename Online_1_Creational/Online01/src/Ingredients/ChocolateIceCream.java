package Ingredients;

public class ChocolateIceCream extends Ingredient{
    public ChocolateIceCream(){
        name = "Chocolate Ice Cream";
        price = 0;
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
