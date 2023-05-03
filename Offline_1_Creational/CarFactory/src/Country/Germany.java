package Country;

public class Germany implements Country{
    private String country;
    @Override
    public String getCountry() {
        country = "Germany";
        return country;
    }
}
