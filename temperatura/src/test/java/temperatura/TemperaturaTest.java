package temperatura;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class TemperaturaTest {

    @Test
    public void testConverterParaCelsius() {
        Temperatura temperatura = new Temperatura();

        double temperatura1 = 32;
        double resultado1 = temperatura.converterParaCelsius(temperatura1);
        assertEquals(0, resultado1);

        double temperatura2 = 50;
        double resultado2 = temperatura.converterParaCelsius(temperatura2);
        assertEquals(10, resultado2);

        double temperatura3 = 68;
        double resultado3 = temperatura.converterParaCelsius(temperatura3);
        assertEquals(20, resultado3);
    }

    @Test
    public void testLerTemperatura() {
        Temperatura temperatura = new Temperatura();

        // Teste com valor válido
        double temperatura1 = 75.5;
        double resultado1 = temperatura.lerTemperatura(new Scanner("75,5"));
        assertEquals(resultado1, temperatura1 );

        // Teste com valor inválido (letra)
        double resultado2 = temperatura.lerTemperatura(new Scanner("abc"));
        assertEquals(Double.NaN, resultado2);

        // Teste com valor 0
        double resultado3 = temperatura.lerTemperatura(new Scanner("0\n"));
        assertEquals(0, resultado3);
    }
}
