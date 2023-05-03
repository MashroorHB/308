
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataServer implements iSubject{
    private List<iObserver> users;
    private List< List<String> > data;
    private DataServer backup;
    private int state;

    public DataServer(){
        users = new ArrayList<iObserver>();
        data = new ArrayList<>();
        state = 1;
    }

    @Override
    public void register(iObserver user){
        users.add(user);
        backup.getUsers().add(user);
        List<String> msg = new ArrayList<>();
        data.add(msg);
        msg = new ArrayList<>();
        backup.getData().add(msg);
    }

    @Override
    public void unregister(iObserver user) {
        int k = getIndex(user);
        users.remove(k);
        return;
    }

    @Override
    public void setState(int state) throws IOException {
        notifyAll(state);
        this.state = state;
    }

    @Override
    public void notifyAll(int state) throws IOException {
        for(iObserver ob : users){
            if(this.state==1 && state==2){
                if(ob instanceof PremiumUser){

                    PremiumUser a = (PremiumUser) ob;
                    a.getServer().getOut().println("Wanna Backup?");
                    String s = a.getServer().getIn().readLine();
                    if(s.equalsIgnoreCase("YES")){
                        a.getServer().getOut().println("Backing up Data Premium Service just in case");
                        makeBackup(a);
                        a.setProtect(true);
                    }
                    else{
                        a.getServer().getOut().println("Will back up later");
                        backup.remove(a);
                        a.setProtect(false);
                    }
                }
                if(ob instanceof RegularUser){
                    RegularUser a = (RegularUser) ob;
                    a.getServer().getOut().println("Wanna Backup? (Pay $20)");
                    String s = a.getServer().getIn().readLine();
                    if(s.equalsIgnoreCase("YES")){
                        a.getServer().getOut().println("Backing up Data just in case");
                        makeBackup(a);
                        a.setBill(a.getBill()+20);
                        a.setProtect(true);
                        //bill info
                    }
                    else{
                        a.getServer().getOut().println("WARNING: Data not backed up, server is vulnerable");
                        a.setProtect(false);
                        backup.remove(a);
                    }
                }
            }
            else if(this.state==1 && state==3){
                if(ob instanceof PremiumUser){
                    PremiumUser a = (PremiumUser) ob;
                    a.getServer().getOut().println("Backing up Data Premium Service");
                    makeBackup(a);
                    remove(a);
                    a.setProtect(true);
                }
                if(ob instanceof RegularUser){
                    RegularUser a = (RegularUser) ob;
                    a.getServer().getOut().println("(Pay $20) wanna continue using backup service?");
                    String s = a.getServer().getIn().readLine();
                    if(s.equalsIgnoreCase("YES")){
                        a.getServer().getOut().println("Backing up Data");
                        makeBackup(a);
                        remove(a);
                        a.setBill(a.getBill()+20);
                        a.setProtect(true);
                    }
                    else{
                        a.getServer().getOut().println("WARNING: Data loss is about to occur");
                        remove(a);
                        a.setProtect(false);
                    }

                }
            }
            else if(this.state==2 && state==1){
                if(ob instanceof PremiumUser){
                    PremiumUser a = (PremiumUser) ob;
                    a.getServer().getOut().println("Server has recovered, emptying backup");
                    if(a.getProtect()) {
                        backup.remove(a);
                        a.setProtect(false);
                    }
                }
                if(ob instanceof RegularUser){
                    RegularUser a = (RegularUser) ob;
                    a.getServer().getOut().println("Server has recovered, emptying backup");
                    if(a.getProtect()) {
                        backup.remove(a);
                        a.setProtect(false);
                    }
                    a.getServer().getOut().println("Your bill is so far is $"+a.getBill());
                }
            }
            else if(this.state==2 && state==3){
                if(ob instanceof PremiumUser){
                    PremiumUser a = (PremiumUser) ob;
                    a.getServer().getOut().println("Server is about to malfunction, backing up.");
                    if(!a.getProtect()) {
                        makeBackup(a);
                        a.setProtect(true);
                    }
                    remove(a);
                }
                if(ob instanceof RegularUser){
                    RegularUser a = (RegularUser) ob;
                    a.getServer().getOut().println("Server is about to malfunction.");
                    remove(a);
                }
            }
            else if(this.state==3 && state==1){
                if(ob instanceof PremiumUser){
                    PremiumUser a = (PremiumUser) ob;
                    backup.makeBackup(a);
                    a.setProtect(false);
                    backup.remove(a);
                    a.getServer().getOut().println("Data restored after temporary server failure");
                }
                if(ob instanceof RegularUser){
                    RegularUser a = (RegularUser) ob;
                    if(a.getProtect()){
                        backup.makeBackup(a);
                        a.setProtect(false);
                        a.getServer().getOut().println("Data restored after temporary server failure");
                    }
                    else{
                        a.getServer().getOut().println("Data loss might have occurred.");
                    }
                    backup.remove(a);
                    a.getServer().getOut().println("Your bill is $"+a.getBill());
                }
            }

            if(state==1){
                ob.getServer().getOut().println("Server is currently operational");
                display(ob);
            }
            else if(state==2){
                ob.getServer().getOut().println("Server is currently partially down");
            }
            else if(state==3){
                ob.getServer().getOut().println("Server is currently fully down");
            }
        }
    }

    @Override
    public void addData(iObserver ob, String data){
        int k = getIndex(ob);
        if(k>=0){
            this.data.get(k).add(data);
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

    public void remove(iObserver ob1){
        int k = getIndex(ob1);
        if(k>=0){
            //users.remove(k);
            while(data.get(k).size()>0){
                data.get(k).remove(0);
            }
        }
    }

    public void makeBackup(iObserver ob1){
        int k = getIndex(ob1);
        if(k>=0){
            for(int i=0; i<data.get(k).size(); i++){
                backup.getData().get(k).add(data.get(k).get(i));
            }
        }
    }

    public DataServer getBackup() {
        return backup;
    }

    public void setBackup(DataServer backup) {
        this.backup = backup;
    }

    public List<iObserver> getUsers() {
        return users;
    }

    public List<List<String>> getData() {
        return data;
    }

    public void display(iObserver a){
        int k = getIndex(a);
        if(k>=0){
            a.getServer().getOut().println("YOUR DATA:");
            for(int i=0; i<data.get(k).size(); i++){
                a.getServer().getOut().println(data.get(k).get(i));
            }
        }
    }
}
