import java.util.Scanner;
public class DivisionsRechner {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welchen Rechner möchtest du starten?(1(division)2(addieren)3(subtrahieren)4(Multiplikation)");
        int Eingabe = input.nextInt();
        if (Eingabe == 1 ) {

        System.out.println("Starte Divisionsrechner...");
        System.out.println("Tippe Zahl ein");
        int zahl1 = input.nextInt();
        System.out.println("/");
        int zahl2 = input.nextInt();
        int ergebnis = zahl1 % zahl2;
        System.out.println("Ergebnis:" + ergebnis);
        }

        ;


        if (Eingabe == 2 ) {

            System.out.println("Starte Additionsrechner...");
            System.out.println("Tippe Zahl ein");
            int zahl1 = input.nextInt();
            System.out.println("+");
            int zahl2 = input.nextInt();
            int ergebnis = zahl1 + zahl2;
            System.out.println("Ergebnis:" + ergebnis);
        }
        if (Eingabe == 3 ) {

            System.out.println("Starte Subtraktionsrechner...");
            System.out.println("Tippe Zahl ein");
            int zahl1 = input.nextInt();
            System.out.println("-");
            int zahl2 = input.nextInt();
            int ergebnis = zahl1 - zahl2;
            System.out.println("Ergebnis:" + ergebnis);
        }

        if (Eingabe == 4 ) {

            System.out.println("Starte Multiplikationsrechner...");
            System.out.println("Tippe Zahl ein");
            int zahl1 = input.nextInt();
            System.out.println("x");
            int zahl2 = input.nextInt();
            int ergebnis = zahl1 * zahl2;
            System.out.println("Ergebnis:" + ergebnis);
        }


    }
}
