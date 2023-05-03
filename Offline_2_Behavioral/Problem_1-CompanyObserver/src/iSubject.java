
import java.io.IOException;

public interface iSubject {
    public void register(iObserver user);
    public void unregister(iObserver user);
    public void setState(int state) throws IOException;
    public void notifyAll(int state) throws IOException;
    public void addData(iObserver ob, String data);
    public int getIndex(iObserver ob1);
}
