package Dev_05;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String string = scanner.nextLine();
        scanner.close();

        String resultado = inverterString(string);

        System.out.println("String invertida: " + resultado);
    }

    private static String inverterString(String str) {
        char[] caracteres = str.toCharArray();

        int inicio = 0;
        int fim = str.length() - 1;

        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;

            inicio++;
            fim--;
        }
        return new String(caracteres);
    }
}

