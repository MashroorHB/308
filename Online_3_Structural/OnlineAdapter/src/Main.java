public class Main {
    public static void main(String[] args) {
        iAkash akash0 = new Akash("NID0", 1200);
        iAkash akash1 = new Akash("NID1", 1400);
        iForeignWallet payFren0 = new PayFren("SSN0", 30);
        iForeignWallet payFren1 = new PayFren("SSN1", 25);
        iForeignWallet dharai0 = new DHarai("KB0", 3000);
        iForeignWallet dharai1 = new DHarai("KB1", 4000);
        AkashAdapter adp0 = new AkashAdapter(payFren0);
        AkashAdapter adp1 = new AkashAdapter(payFren1);
        AkashAdapter adk0 = new AkashAdapter(dharai0);
        AkashAdapter adk1 = new AkashAdapter(dharai1);
        akash0.send(akash1, 500);
        adp0.send(adp1, 5);
        adk0.send(adk1,1000);
        adp0.send(akash0, 30000);
        adp0.send(akash0,2);
        akash1.send(adk1,500);

    }
}
