package main;
import temperatura.Temperatura;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    Temperatura temperatura = new Temperatura();

	    System.out.println("Informe a temperatura em graus Fahrenheit: ");
	    double temperaturaFahrenheit = temperatura.lerTemperatura(scanner);

	    if (Double.isNaN(temperaturaFahrenheit)) {
	        System.out.println("Temperatura inválida. Tente novamente.");
	    } else {
	        double temperaturaCelsius = temperatura.converterParaCelsius(temperaturaFahrenheit);
	        System.out.println("Temperatura em graus Celsius: " + temperaturaCelsius);
	    }

	    scanner.close();
	}
}