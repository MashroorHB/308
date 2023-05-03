package Builder;

import Ingredients.*;
import Ingredients.Milk.AlmondMilk;
import Ingredients.Milk.NormalMilk;
import Shake.*;


public class ChocolateShakeBuilder implements iBuilder{
    private Shake shake = new Shake();

    @Override
    public void addBase(Boolean lactose) {
        if(lactose) shake.addPart(new NormalMilk());
        else shake.addPart(new AlmondMilk());
        shake.addPart(new ChocolateSyrup());
        shake.addPart(new ChocolateIceCream());
        shake.addPrice(230);
    }

    @Override
    public void addCustom() {
        shake.addPart(new Sugar());
    }

    @Override
    public void addCandy() {
        shake.addPart(new Candy());
    }

    @Override
    public void addCookie() {
        shake.addPart(new Cookie());
    }


    @Override
    public Shake getShake() {
        return shake;
    }

}
