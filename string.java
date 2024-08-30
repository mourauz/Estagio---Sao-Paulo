import java.util.Scanner;

public class InversorString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String input = scanner.nextLine();

        String invertida = inverteString(input);
        System.out.println("String invertida: " + invertida);

        scanner.close();
    }

    public static String inverteString(String str) {
        StringBuilder inverso = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            inverso.append(str.charAt(i));
        }
        return inverso.toString();
    }
}
