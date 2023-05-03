
public interface iObserver {
    public void update(String state);
    public void setServer (Server server);
    public Server getServer();
    public Boolean getProtect();
    public void setProtect(Boolean protect);
}
