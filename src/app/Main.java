package app;

public class Main {


    public static void main(String[] args) {
        System.out.println("App for temperature converting.");
        System.out.println("Version 1.0.");

        double f = 10;
        double c = 10;
        double fahrenheit = (convFahrenheitToCelsius(f));
        double celsius = (convCelsiusToFahrenheit(c));
        System.out.println("Result is " + fahrenheit + "\" °F\" "+ " and "+ celsius + " °C");
    }
    private static double convFahrenheitToCelsius(double f){
        return (f - 32) * 5 / 9;
    }
    private static double convCelsiusToFahrenheit(double c){
        return c * 9 / 5 + 32;
    }


}