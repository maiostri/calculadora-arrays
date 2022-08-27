import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class CalculadoraArray {

    // varargs -> soma(1), soma(1,2), soma(1,2,3,4,5)
    public double soma(double... elementos) {
        return Stream.ofNullable(elementos)
                .flatMapToDouble(DoubleStream::of)
                .sum();
    }

    // Dividir todos os elementos da lista por um número.
    public List<Double> divisao(Double divisor, Double... elementos) throws NumeroInvalidoException {

        if (divisor == 0 || divisor == null) {
            throw new NumeroInvalidoException("Não é possivel dividir!!");
        }

        return
                Arrays
                .stream(elementos)
                // (Double / Double) -> Double
                // (double / double) -> precisa fazer um cast.
                .map(elemento -> elemento / divisor)
                .collect(Collectors.toList());
    }

}
