package ClassesAbstratasInterfaceHeranca.main.colecoesstreams;

import java.util.List;

public class Ex022 {
    public static void main(String[] args) {
        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);

        double somanotas = notas.stream()
                .reduce(0.0, Double::sum);

        double media = somanotas / 5.0;
        System.out.printf("A média das notas é: %s\n", media);

        double menor = notas.stream().min(Double::compare).get();
        double maior = notas.stream().max(Double::compare).get();

        System.out.printf("A menor nota foi: %s\n", menor);
        System.out.printf("A maior nota foi: %s", maior);

    }
}
