package Ingredients.Milk;

public class NormalMilk extends Milk{
    public NormalMilk(){
        name = "Normal Milk";
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
