
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test

    void testAdd() {

// Utworzenie instancji klasy Calculator

        Calculator calculator = new Calculator();

// Wywołanie metody add i przypisanie wyniku do zmiennej result

        int result = calculator.add(10, 5);

// Sprawdzenie, czy wynik jest zgodny z oczekiwaniami

        assertEquals(15, result);

    }

}