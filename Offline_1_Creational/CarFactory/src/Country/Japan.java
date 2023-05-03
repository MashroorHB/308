package Country;

public class Japan implements Country{
    private String country;
    @Override
    public String getCountry() {
        country = "Japan";
        return country;
    }
}
