package states;

import components.VendingMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WaitingForMoneyState implements PossibleState{
    public int amount;

    public WaitingForMoneyState(){
        amount = 0;
    }

    @Override
    public void newRequest(VendingMachine machine) {
        System.out.println("Can't take this command at Waiting For Money State");
    }

    @Override
    public void enterMoney(VendingMachine machine) throws IOException {
        System.out.println("Insert money amount: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int g = Integer.parseInt(br.readLine());
        amount+=g;
        if(amount>=machine.getCost()){
            amount-=machine.getCost();
            machine.setCurrentState(new SoldState(amount));
        }
    }

    @Override
    public void returnMoney(VendingMachine machine) {
        System.out.println("Can't take this command at Waiting For Money state");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Please insert "+ (machine.getCost()-amount)+ " dollars more.");
    }
}
