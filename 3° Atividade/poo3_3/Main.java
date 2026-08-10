package poo3_3;

public class Main {
    public static void main(String[] args) {
        double c = 25.0;

        System.out.println("Celsius para Fahrenheit: " + ConversorTemperatura.celsiusParaFahrenheit(c));
        System.out.println("Celsius para Kelvin: " + ConversorTemperatura.celsiusParaKelvin(c));

        double f = 77.0;
        System.out.println("Fahrenheit para Celsius: " + ConversorTemperatura.fahrenheitParaCelsius(f));
        System.out.println("Fahrenheit para Kelvin: " + ConversorTemperatura.fahrenheitParaKelvin(f));

        double k = 298.15;
        System.out.println("Kelvin para Celsius: " + ConversorTemperatura.kelvinParaCelsius(k));
        System.out.println("Kelvin para Fahrenheit: " + ConversorTemperatura.kelvinParaFahrenheit(k));
    }
}
