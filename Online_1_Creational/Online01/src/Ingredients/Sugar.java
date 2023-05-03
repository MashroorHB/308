package Ingredients;

public class Sugar extends Ingredient{
    public Sugar(){
        name = "Sugar";
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
