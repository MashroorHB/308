import Builder.*;
import Shake.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class BuilderMain {
    public static void main(String[] args) throws IOException {
        System.out.println("Shake Builder 2077\n");
        Director director = new Director();
        iBuilder b = new ChocolateShakeBuilder();
        director.construct(b,true);
        Shake shake = b.getShake();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            System.out.print("Enter O to initiate your order:");
            String e = br.readLine();
            if (e.equalsIgnoreCase("O")) {
                Order o = new Order();
                while (true) {
                    Shake newShake;

                    System.out.print("Are you lactose intolerant?\n Y/N\n" );

                    e = br.readLine();
                    Boolean lactose;

                    if (e.equalsIgnoreCase("Y")) {
                        lactose = true;
                    } else {
                        lactose = false;
                    }


                    System.out.print("Select the type of Shake :\n 1/2/3:\n" );
                    e = br.readLine();
                    if (e.equalsIgnoreCase("1")) {
                        b = new ChocolateShakeBuilder();
                    } else if (e.equalsIgnoreCase("2")) {
                        b = new CoffeeShakeBuilder();
                    } else if (e.equalsIgnoreCase("3")) {
                        b = new ZeroShakeBuilder();
                    } else if (e.equalsIgnoreCase("O")) {
                        System.out.println("Cannot initiate new order without finishing current order !");
                        continue;
                    } else {
                        System.out.println("input out of range !! want to add a Shake?");
                        continue;
                    }
                    director.construct(b,lactose);

                    System.out.println("Welcome to Customization Window!");
                    while(true){
                        System.out.print("Wanna add more? Y/N : ");
                        e = br.readLine();
                        if (e.equalsIgnoreCase("Y")) {
                            ;
                        } else if (e.equalsIgnoreCase("O")) {
                            System.out.println("Cannot initiate new order without finishing current order !");
                            continue;
                        } else {
                            break;
                        }

                        System.out.print("Please select one of the desired custom parts to add:\n" +
                                "1. Candy\n" +
                                "2. Cookie ");
                        e = br.readLine();
                        if (e.equalsIgnoreCase("1")) {
                            director.addCandy(b);
                        } else if (e.equalsIgnoreCase("2")) {
                            director.addCookie(b);
                        } else if (e.equalsIgnoreCase("O")) {
                            System.out.println("Cannot initiate new order without finishing current order !");
                            continue;
                        } else {
                            System.out.println("input out of range !! want to add custom parts?");
                        }

                    }
                    newShake = b.getShake();
                    o.addShake(newShake);

                    System.out.print("Or enter E to finish order. Otherwise, press any key: ");
                    e = br.readLine();
                    if (e.equalsIgnoreCase("E")) {
                        break;
                    } else if (e.equalsIgnoreCase("O")) {
                        System.out.println("Cannot initiate new order without finishing current order !");
                        continue;
                    }
                }
                o.show();
            }
        }
    }
}
