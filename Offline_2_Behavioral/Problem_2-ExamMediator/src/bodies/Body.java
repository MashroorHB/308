package bodies;

import mediator.*;

abstract public class Body {
    protected String name;
    protected Mediator med;

    abstract public void send();
    abstract public void receive();

    public String getName() {
        return name;
    }

    public Mediator getMed() {
        return med;
    }
}
