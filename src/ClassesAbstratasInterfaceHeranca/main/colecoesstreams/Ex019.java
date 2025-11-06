package ClassesAbstratasInterfaceHeranca.main.colecoesstreams;

import java.util.List;
import java.util.stream.Collectors;

public class Ex019 {
    public static void main(String[] args) {
     /* -Criar uma lista contendo os nomes dos funcionários.
        -Filtrar apenas os nomes que tenham menos de 5 caracteres ou exatamente 5 caracteres.
        -Criar uma lista contendo os nomes filtrados.
        -Exibir a lista filtrada no console.*/

        List<String> funcionarios = List.of("Ana", "Bruno", "Carlos", "Amanda", "Alice", "Daniel", "Caroline");

        List<String> funcionariosComAteCincoLetras = funcionarios.stream()
                .filter(f -> f.length() <= 5)
                .collect(Collectors.toList());

        System.out.println(funcionariosComAteCincoLetras);


    }
}
