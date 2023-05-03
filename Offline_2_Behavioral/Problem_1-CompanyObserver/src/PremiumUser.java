
import java.io.BufferedReader;
import java.io.PrintWriter;

public class PremiumUser implements iObserver{
    private Server myServer;
    private Boolean protect;

    public PremiumUser(BufferedReader in, PrintWriter out){
        this.protect = false;
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
}
