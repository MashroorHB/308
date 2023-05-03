package Ingredients;

public class ChocolateSyrup extends Ingredient{
    public ChocolateSyrup(){
        name = "Chocolate Syrup";
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
