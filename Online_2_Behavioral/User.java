public class User implements iObserver{
    private Server myServer;
    @Override
    public void setServer(Server server) {
    myServer = server;
}

    @Override
    public Server getServer() {
        return myServer;
    }

}
