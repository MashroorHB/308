package GraphicsCard;

public class TwoGB extends GraphicsCard{

    public TwoGB(){
        name = "2 GB Graphics Card";
        price = 6500;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
