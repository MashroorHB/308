package Builder;

import PC.PC;

public interface iBuilder {
    public void addBaseParts();
    public void addCustomParts();
    public void addProcessor();
    public void addHz2666();
    public void addHz3200();
    public void addFourGB();
    public void addTwoGB();
    public PC getPC();
}
