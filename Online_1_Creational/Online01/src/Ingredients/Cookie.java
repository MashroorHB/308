package Ingredients;

public class Cookie extends Ingredient{
    public Cookie(){
        name = "Cookie";
        price = 40;
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
