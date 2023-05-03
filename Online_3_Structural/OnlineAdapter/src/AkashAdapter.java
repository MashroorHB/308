public class AkashAdapter implements iAkash{
    iForeignWallet adaptee;

    public AkashAdapter(iForeignWallet adaptee){
        this.adaptee = adaptee;
    }
    @Override
    public void send(iAkash a, double amount) {
        adaptee.send(a,amount);
    }

    @Override
    public void receive(double amount) {
        adaptee.receive(amount);
    }

    @Override
    public String getID() {
        return adaptee.getID();
    }

    @Override
    public String appName() {
        return adaptee.appName();
    }
}
