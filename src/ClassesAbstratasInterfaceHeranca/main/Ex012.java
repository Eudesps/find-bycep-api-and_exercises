package ClassesAbstratasInterfaceHeranca.main;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex012 {
    public static void main(String[] args) {
        String texto = "Olá #mundo! Estou aprendendo #Java e #programação.";

        Pattern pattern = Pattern.compile("#\\w+");
        Matcher matcher = pattern.matcher(texto);

        ArrayList<String> lista = new ArrayList<>();
            while (matcher.find()) {
                lista.add(matcher.group());
            }

        System.out.println(lista);
    }
}
