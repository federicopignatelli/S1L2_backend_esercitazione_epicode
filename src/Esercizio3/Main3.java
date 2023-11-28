package Esercizio3;


import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero compreso tra 0 e 3");
        int number = scanner.nextInt();

        switch (number) {

            case 0: {
                System.out.println("Il tuo numero è zero");
                break;
            }
            case 1: {
                System.out.println("Il tuo numero è uno");
                break;
            }
            case 2: {
                System.out.println("Il tuo numero è due");
                break;
            }
            case 3: {
                System.out.println("Il tuo numero è tre");
                break;
            }
            default: {
                System.out.println("Il tuo numero non è valido");
                break;
            }

        }
    }
}
