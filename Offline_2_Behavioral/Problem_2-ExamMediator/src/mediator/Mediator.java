package mediator;

import bodies.*;

public interface Mediator {
    public void send(Body ob);
    public void receive(Body ob, Script sc);
    public void addBody(Body ob);
}
