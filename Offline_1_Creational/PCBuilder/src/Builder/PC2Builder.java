package Builder;

import Cooler.CPUCooler;
import Cooler.LiquidCooler;
import GraphicsCard.*;
import PC.PC;
import Part.HDD;
import Part.Motherboard;
import Processor.CoreI5;
import Processor.CoreI7;
import RAM.*;

public class PC2Builder implements iBuilder{


    private PC pc = new PC();

    @Override
    public void addBaseParts() {
        pc.addPart(new HDD());
        pc.addPart(new Motherboard());
        pc.addPrice(70000);
    }

    @Override
    public void addCustomParts() {
        pc.addPart(new LiquidCooler());

    }

    @Override
    public void addProcessor() {
        pc.addPart(new CoreI7());
    }

    @Override
    public void addHz2666() {
        RAM a = new Hz2666();
        pc.addPart(a);
        pc.addCustomPrice(a.getPrice());
    }

    @Override
    public void addHz3200() {
        RAM a = new Hz3200();
        pc.addPart(a);
        pc.addCustomPrice(a.getPrice());
    }

    @Override
    public void addFourGB() {
        GraphicsCard a = new FourGB();
        pc.addPart(a);
        pc.addCustomPrice(a.getPrice());
    }

    @Override
    public void addTwoGB() {
        GraphicsCard a = new TwoGB();
        pc.addPart(a);
        pc.addCustomPrice(a.getPrice());
    }

    @Override
    public PC getPC() {
        return pc;
    }

}
