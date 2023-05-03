package Builder;

import Cooler.CPUCooler;
import GraphicsCard.*;
import PC.PC;
import Part.*;
import Processor.*;
import RAM.*;

public class PC4Builder implements iBuilder{



    private PC pc = new PC();

    @Override
    public void addBaseParts() {
        pc.addPart(new HDD());
        pc.addPart(new Motherboard());
        pc.addPrice(70000);
    }

    @Override
    public void addCustomParts() {
        ;
    }

    @Override
    public void addProcessor() {
        pc.addPart(new Ryzen());
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
