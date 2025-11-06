package ClassesAbstratasInterfaceHeranca.main.colecoesstreams;

import java.util.List;
import java.util.stream.Collectors;

public class Ex020 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(2, 3, 5, 7, 11);

        List<Integer> numeroQuadrado = numeros.stream()
                .map(n -> n*n)
                .collect(Collectors.toList());

        System.out.println(numeroQuadrado);
    }
}
