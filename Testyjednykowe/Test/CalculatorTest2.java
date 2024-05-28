
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest2 {

    @Test

    void testAdd() {

        Calculator calculator = new Calculator();

        int result = calculator.add(12, 7);

        assertEquals(19, result);

    }

}