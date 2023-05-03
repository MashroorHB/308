package states;

import components.VendingMachine;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WaitingForRequestState implements PossibleState{
    @Override
    public void newRequest(VendingMachine machine) {
        System.out.println("New request for Product! Please enter 25$: ");
        machine.setCurrentState(new WaitingForMoneyState());
    }

    @Override
    public void enterMoney(VendingMachine machine) {
        System.out.println("Can't take this command at Waiting For Request state");
    }

    @Override
    public void returnMoney(VendingMachine machine) {
        System.out.println("Can't take this command at Waiting For Request state");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Can't take this command at Waiting For Request state");
    }
}
