import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testareSuma() {
//        Given
        int a = 9;
        int b = 7;
//        Calculator calculator = new Calculator(); - doar daca nu avem static pe metoda
//        When
//        int rezultat = calculator.suma(a, b);
        int rezultat = Calculator.suma(a, b);

//        Then
        Assertions.assertEquals(16, rezultat);
    }

    @Test
    public void testareScadere() {
//        Given
        int x = 10;
        int y = 5;
//        When
        int result = Calculator.scadere(x, y);
//        Then
//        Assertions.assertEquals(5, result);
        org.assertj.core.api.Assertions.assertThat(result).isEqualTo(5).isBetween(2, 7);
    }


}

