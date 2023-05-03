package Part;

public class DVDPlayer extends Part{

    public DVDPlayer(){
        name = "DVD Drive";
        price = 6000;
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
