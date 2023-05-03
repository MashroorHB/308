import java.io.IOException;

public interface iSubject {
    public void register(iObserver user);
    public void unregister(iObserver user);
    public void setState(String state) throws IOException;
    public void notifyAll(String state) throws IOException;
    public int getIndex(iObserver ob1);
}
