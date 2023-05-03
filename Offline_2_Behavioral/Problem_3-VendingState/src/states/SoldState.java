package states;

import components.VendingMachine;

public class SoldState implements PossibleState{

    public int amount;

    public SoldState(int amount){
        this.amount = amount;
        System.out.println("Item purchased!");
    }

    @Override
    public void newRequest(VendingMachine machine) {
        System.out.println("Can't take this command at Sold state");
    }

    @Override
    public void enterMoney(VendingMachine machine) {
        System.out.println("Can't take this command at Sold state");
    }

    @Override
    public void returnMoney(VendingMachine machine) {
        System.out.println("Your change is "+amount+" dollars.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Item dispensed");
        machine.setProductCount(machine.getProductCount()-1);
        if(machine.getProductCount()>0) machine.setCurrentState(new WaitingForRequestState());
        else machine.setCurrentState(new EmptyState());
    }
}
