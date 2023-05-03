package Ingredients;

public abstract class Ingredient {
    protected String name;
    protected int price;

    abstract public String getName();
    abstract public int getPrice();
}
