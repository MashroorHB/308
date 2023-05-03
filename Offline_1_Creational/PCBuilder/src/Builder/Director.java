package Builder;

import GraphicsCard.GraphicsCard;
import RAM.RAM;

public class Director {
    iBuilder builder;

    public void construct(iBuilder builder){
        this.builder = builder;
        builder.addBaseParts();
        builder.addProcessor();
        builder.addCustomParts();
    }

    public void addHz2666(iBuilder builder){
        this.builder = builder;
        builder.addHz2666();
    }

    public void addHz3200(iBuilder builder){
        this.builder = builder;
        builder.addHz3200();
    }

    public void addFourGB(iBuilder builder){
        this.builder = builder;
        builder.addFourGB();
    }

    public void addTwoGB(iBuilder builder){
        this.builder = builder;
        builder.addTwoGB();
    }
}
