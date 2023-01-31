import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CalculatorTest
{
    Calculator calc;

    @BeforeAll
    void setupCalc()
    {
        calc = new Calculator();
    }

    @BeforeEach
    void clearCalc()
    {
        calc.clear();
    }


    @Test
    void addPostivenumbers()
    {
        Calculator calc = new Calculator();
        assertEquals(30, calc.add(10, 20));
    }

    @Test
    void addNegativeNumbers()
    {
        Calculator calc = new Calculator();
        assertEquals(-22, calc.add(-12, -10));
    }

   /* @Test
    void testPassword()
    {
        Calculator calc = new Calculator();
        assertTrue(calc.validatePassword("test123"));
        assertFalse(calc.validatePassword("testing"));

    }*/

}