public class DHarai implements iForeignWallet{
    private String id;
    private double balance;
    private final double rate=2.0;
    private final String currency = "yen";

    public DHarai(String id, double initialbalance){
        this.id = id;
        this.balance = initialbalance/rate;
        if(initialbalance<1500){
            System.out.println("You must deposit at least 1500 yen to open a DHarai account!!");
        }
    }

    @Override
    public void send(iAkash a, double amount) {
        if(amount>balance){
            System.out.println("Insufficient balance!!");
            return;
        }
        a.receive(amount);
        balance-=amount;
        System.out.println(id+": Sending "+amount*rate+" "+currency+" to "+ a.appName()+" account ("+a.getID()+")... Current balance "+balance*rate+" "+currency+"...");
    }

    @Override
    public void receive(double amount) {
        balance+=amount;
    }

    @Override
    public String getID() {
        return id;
    }

    @Override
    public String appName() {
        return "D-Harai";
    }
}
