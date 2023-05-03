package bodies;

import mediator.ConcreteMediator;
import mediator.Mediator;

import java.util.LinkedList;

public class Controller extends Body{

    public Controller(Mediator med){
        this.med = med;
        this.name = "Controller";
        med.addBody(this);
    }

    @Override
    public void send() {
        med.send(this);
    }

    @Override
    public void receive() {
        if(med instanceof ConcreteMediator){
            ConcreteMediator a = (ConcreteMediator) med;
            LinkedList<Script> b = a.getScripts(a.getIndex(this));
            int k = 0;
            for(int i=0; i<b.size(); i++){
                med.receive(this, b.get(i));
                if(b.get(i).getMarksUpdated()){
                    System.out.println("NOTICE: Marks of Students id#"+b.get(i).getStudent().getId()+ " has bee updated to "+b.get(i).getMarks());
                    b.get(i).setMarksUpdated(false);
                }
            }
        }
    }
}
