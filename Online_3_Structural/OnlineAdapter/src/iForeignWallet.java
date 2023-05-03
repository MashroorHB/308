public interface iForeignWallet {
    public void send(iAkash a, double amount);
    public void receive(double amount);
    public String getID();
    public String appName();
}
