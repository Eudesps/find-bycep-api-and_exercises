package ClassesAbstratasInterfaceHeranca.main.colecoesstreams;

import java.util.HashSet;
import java.util.Set;

public class Ex016 {
    public static void main(String[] args) {

        // Aqui poderia ser criado com um ArrayList e depois apenas ser colocado dentro de uma HashSet
        //Set<String> eventosUnicos = new HashSet<>(eventos);
        Set<String> eventos = new HashSet<>();

        eventos.add("IA Conference Brasil");
        eventos.add("AI Summit");
        eventos.add("DevFest");
        eventos.add("Cloud Expo");
        eventos.add("IA Conference Brasil");
        eventos.add("DevFest");

        System.out.println(eventos);
    }
}
