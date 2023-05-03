package Ingredients.Milk;

public class AlmondMilk extends Milk{
    public AlmondMilk(){
        name = "Almond Milk";
        price = 60;
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
