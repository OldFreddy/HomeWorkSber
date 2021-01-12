package HomeWork1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TemperatureConverter {
    public static void main(String[] args) {
        double celsius = 100.0;
        System.out.println(celsius + " градусов по Цельсию = " + celsiusToCalvin(celsius) + " градусов по Кельвину");
        System.out.println(celsius + " градусов по Цельсию = " + celsiusToFahrenheit(celsius) + " градусов по Фаренгейту");
    }

    public static double celsiusToCalvin(double celsius) {
        double calvin =  celsius - 273.15;
        BigDecimal result = new BigDecimal(calvin);
        result = result.setScale(3,RoundingMode.HALF_UP);
        return Double.parseDouble(result.toString());
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = 9.0 / 5.0 * celsius + 32;
        BigDecimal result = new BigDecimal(fahrenheit);
        result = result.setScale(3, RoundingMode.HALF_UP);
        return Double.parseDouble(result.toString());

    }
}
