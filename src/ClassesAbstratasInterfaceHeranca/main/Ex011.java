package ClassesAbstratasInterfaceHeranca.main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CPF : ");
        String cpf = scanner.nextLine();

        Pattern pattern = Pattern.compile("^(?!(\\d)\\1{10})(\\d{3}\\.){2}\\d{3}-\\d{2}$");
        Matcher matcher = pattern.matcher(cpf);

        if(matcher.find()){
            System.out.println("O CPF está válido.");
        }else {
            System.out.println("O CPF não está válido.");
        }

        scanner.close();
    }
}
