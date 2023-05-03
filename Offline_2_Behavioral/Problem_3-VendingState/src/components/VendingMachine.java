package components;

import states.*;

import java.io.IOException;

public class VendingMachine {
    private PossibleState currentState;
    final private int cost = 25;
    private int productCount;
    public VendingMachine()
    {
        this.setCurrentState(new StartState(this));
        productCount = 3;
    }
    public PossibleState getCurrentState()
    {
        return currentState;
    }

    public void setCurrentState(PossibleState currentState)
    {
        this.currentState = currentState;
    }

    public void newRequest() {
        currentState.newRequest(this);
    }

    public void enterMoney() throws IOException {
        currentState.enterMoney(this);
    }

    public void returnMoney() {
        currentState.returnMoney(this);
    }

    public void dispenseItem() {
        currentState.dispenseItem(this);
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    public int getCost() {
        return cost;
    }
}
