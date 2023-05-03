import Shake.Shake;

import java.util.LinkedList;

public class Order {
    private LinkedList<Shake> Shakes;

    public Order(){
        Shakes = new LinkedList<Shake>();
    }

    public void addShake(Shake Shake){
        Shakes.addLast(Shake);
    }

    public void show(){
        System.out.println("\nShake(s) that you've ordered:");
        for(int i=0; i<Shakes.size(); i++){
            System.out.println("  Shake#"+(i+1)+" details:");
            Shakes.get(i).show();
        }
    }
}
