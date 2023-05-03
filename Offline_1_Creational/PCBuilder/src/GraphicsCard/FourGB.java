package GraphicsCard;

public class FourGB extends GraphicsCard{

    public FourGB(){
        name = "4 GB Graphics Card";
        price = 7600;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
