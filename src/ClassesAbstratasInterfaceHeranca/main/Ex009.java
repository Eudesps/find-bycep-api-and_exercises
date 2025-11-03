package ClassesAbstratasInterfaceHeranca.main;

import java.util.Scanner;

public class Ex009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrada: ");
        Double numero = scanner.nextDouble();

        //PODE USAR UMA VARIÁVEL SECUNDÁRIA PARA FORMATAR O NÚMERO
        //String valorFormatado = String.format("R$ %.2f", valor);
        System.out.printf("Saida %.2f ", numero);
    }
}
