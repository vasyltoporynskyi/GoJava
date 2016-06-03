package toporynskyi.goit.module04.tempConverter;

/**
 * Created by grant on 6/3/16.
 */
public class Temperature {

    public static void main (String[] args) {
        Temperature cTemp = new Temperature(16);
        Temperature fTemp = new Temperature(60.8);

        System.out.println("t C: " + cTemp.Temperature() +" = t F: " + cTemp.convertToFahrenheit(cTemp));
        System.out.println("t F: " + fTemp.Temperature() +" = t C: " + fTemp.covertToCelsius(fTemp));
    }
    double temperature;

    public Temperature(double temperature) {
        this.temperature = temperature;
    }

    public double Temperature() {
        return temperature;
    }

     public double covertToCelsius(Temperature fahrenheit) {
        return (fahrenheit.temperature - 32) * 5/9;
    }

    public double convertToFahrenheit(Temperature celsius) {
        return celsius.temperature * 9/5 + 32;
    }

}

