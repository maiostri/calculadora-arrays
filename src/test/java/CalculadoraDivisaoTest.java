import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CalculadoraDivisaoTest {

    private CalculadoraArray calculadoraArray = new CalculadoraArray();

    @Test
    public void testDivisao() throws NumeroInvalidoException {
        List<Double> expected = List.of(2D, 4D, 5D);
        List<Double> result = calculadoraArray.divisao(2D, 4D, 8D, 10D);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testDivisaoErrada() throws NumeroInvalidoException {
        List<Double> expected = List.of(3D, 4D, 5D);
        List<Double> result = calculadoraArray.divisao(2D, 4D, 8D, 10D);
        Assertions.assertNotEquals(expected, result);
    }

    @Test
    public void testDivisaoPorZero() {
        // assertThrows - Verifica que uma exceção foi lançada. Caso a exceção
        // não tenha sido lançada, o teste falha.
        Assertions.assertThrows(NumeroInvalidoException.class,
                () -> calculadoraArray.divisao(1D, 4D, 8D, 10D));
    }
}
