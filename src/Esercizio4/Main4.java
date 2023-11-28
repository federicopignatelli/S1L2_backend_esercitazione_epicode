package Esercizio4;
import java.util.Scanner;
public class Main4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Inserisci una parola (:q per uscire): ");
            String input = scanner.nextLine();

            if (input.equals(":q")) {
                System.out.println("Fine");
                break;
            }
        }

        scanner.close();
    }
}
