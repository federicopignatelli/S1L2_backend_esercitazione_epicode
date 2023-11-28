package Esercizio1;

public class Main1 {
    public static void main(String[] args) {
        String parola = "ciaone";

        if (stringaPariDispari(parola)){
            System.out.println("La tua parola ha caratteri pari");
        }
        else {
            System.out.println("La tua parola ha caratteri dispari");
        }
    }
    public static boolean stringaPariDispari (String word){
        return word.length() % 2 == 0;
    }

}
