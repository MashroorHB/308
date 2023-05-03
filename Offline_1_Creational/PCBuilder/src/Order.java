import PC.*;
import Part.Part;

import java.util.LinkedList;

public class Order {
    private LinkedList<PC> pcs;

    public Order(){
        pcs = new LinkedList<PC>();
    }

    public void addPC(PC pc){
        pcs.addLast(pc);
    }

    public void show(){
        System.out.println("\nPC(s) that you've ordered:");
        for(int i=0; i<pcs.size(); i++){
            System.out.println("  PC#"+(i+1)+" details:");
            pcs.get(i).show();
        }
    }
}
