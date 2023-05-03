import Car.*;

public class GetCarFactory {
    public Car getCar(String carContinent){
        if(carContinent == null){
            return null;
        }
        if(carContinent.equalsIgnoreCase("Asia")){
            return new Toyota();
        }
        else if(carContinent.equalsIgnoreCase("Europe")){
            return new BMW();
        }
        else if(carContinent.equalsIgnoreCase("United States")){
            return new Tesla();
        }
        return null;
    }
}
