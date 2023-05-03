public class Akash implements iAkash{
    private String id;
    private double balance;
    private final double rate=1.0;
    private final String currency = "taka";

    public Akash(String id, double initialbalance){
        this.id = id;
        balance = initialbalance/rate;
        if(initialbalance<1000){
            System.out.println("You must ddeposit at least 1000 taka to open an aKash account!!");
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
        return "aKash";
    }
}
