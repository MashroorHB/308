package Country;

public class US implements Country{
    private String country;
    @Override
    public String getCountry() {
        country = "US";
        return country;
    }
}
