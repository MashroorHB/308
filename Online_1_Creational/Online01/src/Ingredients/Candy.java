package Ingredients;

public class Candy extends Ingredient{
    public Candy(){
        name = "Candy";
        price = 50;
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
