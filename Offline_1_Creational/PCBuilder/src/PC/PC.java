package PC;
import Part.Part;
import java.util.LinkedList;

public class PC {
    private int price;
    private int customprice;
    private LinkedList<Part> parts;

    public PC(){
        price = 0;
        customprice =0;
        parts = new LinkedList<Part>();
    }
    public void addPart(Part part){
        parts.addLast(part);
        price+=part.getPrice();
    }
    public void addPrice(int a){
        price+=a;
    }
    public void addCustomPrice(int a){
        customprice+=a;
    }

    public void show(){;
        for(int i=0; i<parts.size(); i++){
            System.out.println("\t"+parts.get(i).getName() + " costed Tk"+ parts.get(i).getPrice());
        }
        System.out.println("  Base price : "+ (price-customprice));
        System.out.println("  Added cost due to customization : "+ customprice);
    }
}
