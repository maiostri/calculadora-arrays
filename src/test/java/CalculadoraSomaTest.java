import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraSomaTest {

    //Junit é a biblioteca para escrita de testes
    // Jasmine(javascript), etc.

    private CalculadoraArray calculadoraArray = new CalculadoraArray();

    @Test
    public void testSoma() {
        double expected = 14D;
        double result = calculadoraArray.soma(1D, 3D, 10D);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testCaracterIncorreto() {
        double expected = 0D;
        double result = calculadoraArray.soma(new double[]{});
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testNumeroNegativo() {
        double expected = 8.999994E7;
        double result = calculadoraArray.soma(-30D, -30D, 0, 90000000);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testNumeroMuitoGrande() {
        double expected = 4.5E8;
        double result = calculadoraArray.soma(90000000, 90000000, 90000000, 90000000, 90000000);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testNull() {
        double expected = 0D;
        double result = calculadoraArray.soma(null);
        Assertions.assertEquals(expected, result);
    }
}
