import Car.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateCar {
    public static void main(String[] args) throws IOException {
        GetCarFactory carFactory = new GetCarFactory();
        System.out.println("Enter country location: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String carContinent = br.readLine();

        Car c = carFactory.getCar(carContinent);

        c.show();
    }
}
