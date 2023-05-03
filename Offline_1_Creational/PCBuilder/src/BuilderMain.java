import Builder.*;
import PC.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class BuilderMain {
    public static void main(String[] args) throws IOException {
        System.out.println("PC Builder 2077\n");
        Director director = new Director();
        iBuilder b = new PC1Builder();
        director.construct(b);
        PC pc = b.getPC();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            System.out.print("Enter O to initiate your order:");
            String e = br.readLine();
            if (e.equalsIgnoreCase("O")) {
                Order o = new Order();
                while (true) {
                    PC newPC;
                    System.out.print("Select the type of PC:\\n\" +\n" +
                            "                                \"1. core i5\\n\" +\n" +
                            "                                \"2. core i7\\n\" +\n" +
                            "                                \"3. core i9\\n\" +\n" +
                            "                                \"4. ryzen :");
                    e = br.readLine();
                    if (e.equalsIgnoreCase("1")) {
                        b = new PC1Builder();
                    } else if (e.equalsIgnoreCase("2")) {
                        b = new PC2Builder();
                    } else if (e.equalsIgnoreCase("3")) {
                        b = new PC3Builder();
                    } else if (e.equalsIgnoreCase("4")) {
                        b = new PC4Builder();
                    } else if (e.equalsIgnoreCase("O")) {
                        System.out.println("Cannot initiate new order without finishing current order !");
                        continue;
                    } else {
                        System.out.println("input out of range !! want to add a pc?");
                        continue;
                    }
                    director.construct(b);

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
                                "1. 8 GB DDR4 RAM 2666MHz\n" +
                                "2. 8 GB DDR4 RAM 3200MHz\n" +
                                "3. 4 GB Graphics Card\n" +
                                "4. 2 GB Graphics Card : ");
                        e = br.readLine();
                        if (e.equalsIgnoreCase("1")) {
                            director.addHz2666(b);
                        } else if (e.equalsIgnoreCase("2")) {
                            director.addHz3200(b);
                        } else if (e.equalsIgnoreCase("3")) {
                            director.addFourGB(b);
                        } else if (e.equalsIgnoreCase("4")) {
                            director.addTwoGB(b);
                        } else if (e.equalsIgnoreCase("O")) {
                            System.out.println("Cannot initiate new order without finishing current order !");
                            continue;
                        } else {
                            System.out.println("input out of range !! want to add custom parts?");
                        }

                    }
                    newPC = b.getPC();
                    o.addPC(newPC);

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
