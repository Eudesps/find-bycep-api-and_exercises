package ClassesAbstratasInterfaceHeranca.main;

import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o texto: ");
        String frase = scanner.nextLine();

        System.out.println("Digite a palavra: ");
        String palavra = scanner.nextLine();

        if (frase.contains(palavra)){
            System.out.printf("A palavra %s está presente no texto.", palavra);
        }else{
            System.out.printf("A palavra %s não está presente no texto.", palavra);
        }
    }
}
