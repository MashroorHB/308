package Builder;

public class Director {
    iBuilder builder;

    public void construct(iBuilder builder, Boolean lactose){
        this.builder = builder;
        builder.addBase(lactose);
        builder.addCustom();
    }

    public void addCandy(iBuilder builder){
        this.builder = builder;
        builder.addCandy();
    }

    public void addCookie(iBuilder builder){
        this.builder = builder;
        builder.addCookie();
    }

}
