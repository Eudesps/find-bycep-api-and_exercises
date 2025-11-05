package ClassesAbstratasInterfaceHeranca.main.colecoesstreams;

import java.util.ArrayList;
import java.util.List;

public class Ex014 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Ana");

        System.out.println("Antes da remoção: " + nomes);

        nomes.remove("Pedro ");
        System.out.println("Após a remoção: " + nomes);
    }
}
