public abstract class Coffee {
    protected String description;
    public String getDescription(){
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract int getPrice();
}
