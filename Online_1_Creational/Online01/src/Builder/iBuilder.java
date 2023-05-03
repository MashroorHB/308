package Builder;

import Ingredients.*;
import Shake.*;

public interface iBuilder {
    public void addBase(Boolean lactose);
    public void addCustom();
    public void addCandy();
    public void addCookie();
    public Shake getShake();
}
