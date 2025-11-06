package ClassesAbstratasInterfaceHeranca.main.colecoesstreams;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> cliente = new HashMap<>();

        cliente.put(1, "Ana Silva");
        cliente.put(2, "Bruno Souza");
        cliente.put(3, "Carlos Almeida");
        cliente.put(4, "Daniela Rocha");
        cliente.put(5, "Eduardo Santos");

        System.out.println("DIGITE O ID QUE SE DESEJA PROCURAR: ");
        Integer id = scanner.nextInt();

            if(cliente.containsKey(id)){
                System.out.printf("O nome do cliente com ID %s é: %s", id, cliente.get(id));
            }else{
                System.out.printf("Cliente com ID %s não encontrado.", id);
            }



    }
}
