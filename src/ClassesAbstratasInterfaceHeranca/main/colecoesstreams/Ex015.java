package ClassesAbstratasInterfaceHeranca.main.colecoesstreams;

import java.util.ArrayList;
import java.util.List;

public class Ex015 {
    public static void main(String[] args) {
        List<String> funcionarios =  new ArrayList<>();
        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("Ana");
        funcionarios.add("Pedro");
        funcionarios.add("Antônio");

        System.out.println("Segunda pessoa da Lista é: " + funcionarios.get(1));
        System.out.println("Total de funcionários: " + funcionarios.size());
    }
}
