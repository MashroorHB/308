import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Forcastor implements  iSubject{
    private List<iObserver> users;

    public Forcastor(){

        users = new ArrayList<iObserver>();
    }
    @Override
    public void register(iObserver user) {
        users.add(user);
    }

    @Override
    public void unregister(iObserver user) {
        int k = getIndex(user);
        users.remove(k);
        return;
    }

    @Override
    public void setState(String state) throws IOException {
        notifyAll(state);
    }

    @Override
    public void notifyAll(String state) throws IOException {
        for(iObserver ob : users) {
            ob.getServer().getOut().println("The weather is currently "+state);
        }
    }

    @Override
    public int getIndex(iObserver ob1){
        int i=0;
        for(iObserver ob2 : users){
            if(ob1.equals(ob2)){
                return i;
            }
            i++;
        }
        return -1;
    }
}
