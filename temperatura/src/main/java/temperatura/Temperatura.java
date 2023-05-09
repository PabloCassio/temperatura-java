package temperatura;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Temperatura {
    public double converterParaCelsius(double temperaturaFahrenheit) {
        return (temperaturaFahrenheit - 32) / 1.8;
    }

    public double lerTemperatura(Scanner scanner) {
        double temperatura = 0;
        try {
            temperatura = scanner.nextDouble();
        } catch (InputMismatchException e) {
            scanner.nextLine(); // Limpar o buffer do scanner
            temperatura = Double.NaN; // Valor inválido
        } finally {
            scanner.nextLine(); // Limpar o buffer do scanner em qualquer caso
        }
        return temperatura;
    }
}