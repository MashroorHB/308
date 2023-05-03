package states;

import components.VendingMachine;

public class StartState implements PossibleState{
    public StartState(VendingMachine machine){
        System.out.println("Welcome!!!");
        machine.setCurrentState(new WaitingForMoneyState());
    }

    @Override
    public void newRequest(VendingMachine machine) {
        System.out.println("First Request! Please enter 25$: ");
        machine.setCurrentState(new WaitingForMoneyState());
    }

    @Override
    public void enterMoney(VendingMachine machine) {
        System.out.println("Can't take this command at Start state");
    }

    @Override
    public void returnMoney(VendingMachine machine) {
        System.out.println("Can't take this command at Start state");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Can't take this command at Start state");
    }
}
