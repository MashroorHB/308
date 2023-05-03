package Shake;

import Ingredients.*;

import java.util.LinkedList;

public class Shake {
    private int price;
    private int customprice;
    private LinkedList<Ingredient> ingredients;

    public Shake(){
        price = 0;
        customprice =0;
        ingredients = new LinkedList<Ingredient>();;
    }
    public void addPart(Ingredient ingredient){
        ingredients.addLast(ingredient);
        price+=ingredient.getPrice();
    }
    public void addPrice(int a){
        price+=a;
    }
    public void addCustomPrice(int a){
        customprice+=a;
    }

    public void show(){;
        for(int i=0; i<ingredients.size(); i++){
            System.out.println("\t"+ingredients.get(i).getName() + " costed Tk"+ ingredients.get(i).getPrice());
        }
        System.out.println("  Base price : "+ (price-customprice));
        System.out.println("  Added cost due to custom ingredients : "+ customprice);
    }
}
