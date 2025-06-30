package app;

public class Main {


    public static void main(String[] args) {
        System.out.println("App for temperature converting.");
        System.out.println("Version 1.0.");

        double f = 10;
        double fahrenheit = (convFahrenheitToCelsius(f));
        System.out.println("Result is " + fahrenheit + "\" °F\"");
    }
    private static double convFahrenheitToCelsius(double f){
        return (f - 32) * 5 / 9;
    }


}