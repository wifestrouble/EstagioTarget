import java.util.Scanner;
public class Dois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, insira uma string: ");
        String input = scanner.nextLine();

        int contador = 0;

        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i); 
            if (a == 'a' || a == 'A') {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("A letra 'a' ou 'A' foi encontrada " + contador + " vezes na entrada.");
        } else {
            System.out.println("A letra 'a' ou 'A' não foi encontrada na entrada.");
        }
        scanner.close();
    }
}
