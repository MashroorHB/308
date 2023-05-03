package states;

import components.*;

import java.io.IOException;

public interface PossibleState {
    void newRequest(VendingMachine machine);
    void enterMoney(VendingMachine machine) throws IOException;
    void returnMoney(VendingMachine machine);
    void dispenseItem(VendingMachine machine);
}
