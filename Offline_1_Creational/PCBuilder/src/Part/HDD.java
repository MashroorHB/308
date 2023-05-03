package Part;

public class HDD extends Part{

    public HDD(){
        name = "HDD";
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
