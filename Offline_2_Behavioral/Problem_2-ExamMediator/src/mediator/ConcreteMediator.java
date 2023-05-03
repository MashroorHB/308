package mediator;

import bodies.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConcreteMediator implements Mediator{
    private LinkedList<Script>[] scripts;
    private List<Body> bodies;

    public ConcreteMediator(int size){
        bodies = new ArrayList<Body>();
        scripts = new LinkedList[size];
        for(int i=0;i<size;i++){
            scripts[i] = new LinkedList<>();
        }
    }

    @Override
    public void send(Body ob) {
        int idx = getIndex(ob);
        int rdx = 0;
        if(scripts[idx].size()>0){
            System.out.println("Sending all script from "+ob.getName());
            while(scripts[idx].size()>0){
                if(ob.getName().equalsIgnoreCase("Examiner")){
                    scripts[1].addLast(scripts[idx].get(0));
                    rdx = 1;
                }
                else if(ob.getName().equalsIgnoreCase("Controller")){
                    rdx = getIndex(scripts[idx].get(0).getStudent());
                    scripts[rdx].addLast(scripts[idx].get(0));
                    System.out.println(rdx);
                }
                else{
                    scripts[0].addLast(scripts[idx].get(0));
                    rdx = 0;
                }
                scripts[idx].removeFirst();
            }
            //bodies.get(rdx).receive();
        }
    }

    @Override
    public void receive(Body ob, Script sc) {
        int rdx = sc.getStudent().getId();
        if(ob.getName().equalsIgnoreCase("Examiner")){
            System.out.println("Examiner has scrutinized script of Student id#"+rdx);
        }
        else if(ob.getName().equalsIgnoreCase("Student")){
            System.out.println("Student id#"+rdx+" has received their script after scrutiny.");
        }
        else{
            System.out.println("Exam Controller has received script of Student id#"+rdx+" from the Examiner.");
        }
    }

    @Override
    public void addBody(Body ob) {
        bodies.add(ob);
        //System.out.println("Hello");
    }

    public LinkedList<Script> getScripts(int idx) {
        return scripts[idx];
    }

    public int getIndex(Body ob){
        for(int i=0; i<bodies.size(); i++){
            if(ob.getName().equalsIgnoreCase(bodies.get(i).getName())){
                if(!(bodies.get(i).getName().equalsIgnoreCase("Examiner") || bodies.get(i).getName().equalsIgnoreCase("Controller"))){
                    if((ob instanceof Student) && (bodies.get(i) instanceof Student)){
                        if(((Student) ob).getId()==((Student) bodies.get(i)).getId()){
                            return i;
                        }
                    }
                }
                else{
                    return i;
                }
            }
        }
        return -1;
    }

    public void generateScripts(){
        for(int i=0; i<bodies.size(); i++){
            //System.out.println(bodies.get(i).getName());
            if(!(bodies.get(i).getName().equalsIgnoreCase("Examiner") || bodies.get(i).getName().equalsIgnoreCase("Controller"))){
                if(bodies.get(i) instanceof Student){
                    Script sc = new Script();
                    sc.setStudent((Student) bodies.get(i));
                    sc.setMarks(0);
                    scripts[i].addLast(sc);
                    System.out.println("done");
                }
            }
        }
    }

}
