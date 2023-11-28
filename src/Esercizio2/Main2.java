package Esercizio2;

public class Main2 {
    public static void main(String[] args) {
        int anno = 2022;

        if (annoBisestile(anno)){
            System.out.println("Il tuo anno è bisestile");
        }
        else {
            System.out.println("Il tuo anno non è bisestile");
        }
    }
    public static boolean annoBisestile(int number) {
        return number % 4 == 0;
    }
}
