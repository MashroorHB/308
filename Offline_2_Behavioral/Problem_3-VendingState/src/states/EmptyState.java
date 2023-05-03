package states;

import components.VendingMachine;

public class EmptyState implements PossibleState{
    @Override
    public void newRequest(VendingMachine machine) {
        System.out.println("No more product available");
    }

    @Override
    public void enterMoney(VendingMachine machine) {
        System.out.println("No more product available");
    }

    @Override
    public void returnMoney(VendingMachine machine) {
        System.out.println("No more product available");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("No more product available");
    }
}
