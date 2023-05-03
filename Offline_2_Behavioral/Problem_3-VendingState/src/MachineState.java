import components.VendingMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MachineState {
    public static void main(String[] args) throws IOException {
        VendingMachine machine = new VendingMachine();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("Exit?(0) New Request?(1) Insert Money?(2) Dispense?(3): ");
            String e = br.readLine();
            if(e.equalsIgnoreCase("0")){
                System.out.println("Exiting Vending Machine Prompt :'( ");
                break;
            }
            else if(e.equalsIgnoreCase("1")){
                machine.newRequest();
            }
            else if(e.equalsIgnoreCase("2")){
                machine.enterMoney();
            }
            else if(e.equalsIgnoreCase("3")){
                machine.returnMoney();
                machine.dispenseItem();
            }
        }
    }
}
