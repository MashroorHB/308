package Engine;

public class Electric implements Engine{
    private String engine;
    @Override
    public String getEngine() {
        engine = "Electric";
        return engine;
    }
}
