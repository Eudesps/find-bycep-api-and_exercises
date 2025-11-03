package ClassesAbstratasInterfaceHeranca.main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Código: ");
        String cod = scanner.nextLine();

        Pattern pattern = Pattern.compile("^[A-Z]{3}-\\d{4}$");
        Matcher matcher = pattern.matcher(cod);

        if(matcher.find()){
            System.out.println("O código de referência está válido.");
        }else {
            System.out.println("O código de referência não está válido.");
        }

        scanner.close();
    }
}
