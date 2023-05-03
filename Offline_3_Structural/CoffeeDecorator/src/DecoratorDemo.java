import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DecoratorDemo {
    public static void main(String[] args) {
        List<Coffee> order = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Initiating order:");
        while(true){
            System.out.println("Order a cup?(Y/n)");
            String s = sc.nextLine();
            if(s.equalsIgnoreCase("Y")){
                System.out.println("What coffee would you like?:\n1.Americano\n2.Espresso\n3.Cappuccino\n4.Mocha");
                s = sc.nextLine();
                if(s.equalsIgnoreCase("1")){
                    Americano a = new Americano();
                    order.add(a.getCoffee());
                }
                if(s.equalsIgnoreCase("2")){
                    Espresso a = new Espresso();
                    order.add(a.getCoffee());
                }
                if(s.equalsIgnoreCase("3")){
                    Cappuccino a = new Cappuccino();
                    order.add(a.getCoffee());
                }
                if(s.equalsIgnoreCase("4")){
                    Mocha a = new Mocha();
                    order.add(a.getCoffee());
                }
                System.out.println("Thanks for the order!");
            }
            else break;
        }
        for(int i = 0; i<order.size(); i++){
            System.out.println("coffee#"+(i+1)+" : "+order.get(i).getDescription()+"\t$"+order.get(i).getPrice());
        }
    }
}
