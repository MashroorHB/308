package Part;

public class Motherboard extends Part{

    public Motherboard(){
        name = "Motherboard";
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
