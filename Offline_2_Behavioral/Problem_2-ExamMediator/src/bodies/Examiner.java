package bodies;

import mediator.ConcreteMediator;
import mediator.Mediator;

import java.util.LinkedList;

public class Examiner extends Body{

    public Examiner(Mediator med){
        this.med = med;
        this.name = "Examiner";
        med.addBody(this);
    }

    @Override
    public void send() {
        System.out.println("Examiner has sent the scripts to exam controller.");
        med.send(this);
    }

    @Override
    public void receive() {
        System.out.println("Examiner is checking the scripts");
        if(med instanceof ConcreteMediator){
            ConcreteMediator a = (ConcreteMediator) med;
            LinkedList<Script> b = a.getScripts(a.getIndex(this));
            int k = 0;
            System.out.println(a.getIndex(this));
            for(int i=0; i<b.size(); i++){
                int g = randomGenerator();
                if(i==b.size()-1 && k==0){
                    g = b.get(i).getMarks();
                    g+=5;
                }
                if(g!=b.get(i).getMarks()) b.get(i).setMarksUpdated(true);
                b.get(i).setMarks(g);
                med.receive(this, b.get(i));
            }
        }
    }

    public int randomGenerator(){
        int g = (int) (Math.random()*100);
        return g;
    }
}
