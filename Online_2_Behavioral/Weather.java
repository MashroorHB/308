public class Weather {
    double temperature;
    String feels;
    Boolean possibilityOfStorm;
    Boolean possibilityOfHeavySnow;
    public Weather(double temperature, String feels, Boolean possibilityOfStorm, Boolean possibilityOfHeavySnow){
        this.temperature = temperature;
        this.feels = feels;
        this.possibilityOfStorm = possibilityOfStorm;
        this.possibilityOfHeavySnow = possibilityOfHeavySnow;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getFeels() {
        return feels;
    }

    public void setFeels(String feels) {
        this.feels = feels;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public Boolean getPossibilityOfHeavySnow() {
        return possibilityOfHeavySnow;
    }

    public Boolean getPossibilityOfStorm() {
        return possibilityOfStorm;
    }

    public void setPossibilityOfHeavySnow(Boolean possibilityOfHeavySnow) {
        this.possibilityOfHeavySnow = possibilityOfHeavySnow;
    }

    public void setPossibilityOfStorm(Boolean possibilityOfStorm) {
        this.possibilityOfStorm = possibilityOfStorm;
    }
}
