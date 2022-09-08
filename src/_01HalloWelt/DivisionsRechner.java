import java.util.Scanner;
public class DivisionsRechner {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welchen Rechner möchtest du starten?(1(division)2(addieren)3(subtrahieren)");
        int division = input.nextInt();
        if (division== 1 ) {

        System.out.println("Starte Divisionsrechner...");
        System.out.println("Tippe Zahl ein");
        int zahl1 = input.nextInt();
        System.out.println("/");
        int zahl2 = input.nextInt();
        int ergebnis = zahl1 % zahl2;
        System.out.println("Ergebnis:" + ergebnis);
        }


    }
}
