package bodies;

import mediator.ConcreteMediator;
import mediator.Mediator;

import java.util.LinkedList;

public class Student  extends Body{
    private int id;

    public Student(){
        ;
    }

    public Student(Mediator med, int id){
        this.med = med;
        this.id = id;
        this.name = "Student";
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
            }
        }
    }

    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return super.getName() + " " + id;
    }
}
