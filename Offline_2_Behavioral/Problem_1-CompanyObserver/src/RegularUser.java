import java.io.BufferedReader;
import java.io.PrintWriter;

public class RegularUser implements iObserver{
    private Server myServer;
    private Boolean protect;
    private int bill;

    public RegularUser(BufferedReader in, PrintWriter out){
        this.protect = false;
        bill = 0;
    }

    public void update(String state){
        myServer.getOut().println("Server is currently " + state);
    }

    @Override
    public void setServer(Server server) {
        myServer = server;
    }

    @Override
    public Server getServer() {
        return myServer;
    }

    @Override
    public void setProtect(Boolean protect) {
        this.protect = protect;
    }

    @Override
    public Boolean getProtect() {
        return protect;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }
}
