package Grundlagen;

public class Grundlagen {
    // 8 primitive Datentypen in Java
    /*
     * byte
     * short
     * int
     * long
     * float
     * double
     * boolean
     * char
     */
    // <Datentyp> <Variablenamen> = <Wert> ;
    public static void main(String[] args) {

        int varZahl1 = 3;
        long varZahl2 = 300;

        double varZahl3 = 322.23;
        float varZahl4 = 23.34f;

        boolean userKlick = false;

        char zeichen = '!';

        varZahl1 = 5;

        int highscore = 0;
        System.out.println("Dein Highscore: " + highscore);
        highscore = 10;
        System.out.println("Dein Highscore: " + highscore);
        highscore = 20;
        System.out.println("Dein Highscore: " + highscore);


        //weitere Datentypen
        //int float double

        int varZahl10 = 10 / 3;
        float varZahl20 = 10f / 3f;
        double varZahl30 = 10d / 3d;


        System.out.println("int " + varZahl10 );
        System.out.println("float " + varZahl20 );
        System.out.println("double " + varZahl30 );

        //Zeichenketten

        char varZeichen = '!';

        String zeichenkette = new String();
        String varZeichenkette = "Ich bin eine Zeichenkette";

        String name = "Eva Elif Meva Sarikaya";
        String alter  = "23";

        System.out.println("Dein Name ist " + name + " dein Alter ist " + alter );


        // Komplexe Datetypen
        // String (Zeichenkette)

        // <Datentyp> <Variablenamen> = <Wert> ;
        char varZeichen1 = '\u00A9';
        System.out.println("Das Bild unterliegt dem " + varZeichen1);

        // true = wahr false = nicht wahr
        boolean userKlick1 = false;


        //Casten

        /*Was ist eine Typumwandlung / Casten?
         *
         * Das ist eine Umwandlung von einem Datentypen in einen anderen Datentypen
         */

        int userAlter = (int)18.5;  // (int) = castoperator
        System.out.println(userAlter);



        // Implizites Casten (von klein nach groß) Keine Datenverluste
        // Umwandlung findet bei Zuweisung statt
        int zahl1 = 30;
        double zahl2 = zahl1;
        System.out.println(zahl2);


        // Explizite Casten (von groß nach klein) Datenverluste
        // Umwandlung findet mit Hilfe des cast (Datentyp)-Operators statt

        // 1. Auto = 3450,45€  2. Auto = 2690,94€
        int autoPreis1 = (int)3450.45;
        int autoPreis2 = (int)2690.94;

        int gesamtPreis = autoPreis1 + autoPreis2;
        System.out.println(gesamtPreis);


        //Operatoren

        // Was sind Operatoren?
        /*
         * Mit Operatoren kann man Variablen verändern oder allgemein
         * mit ihnen arbeiten
         *
         */

        int varZahl = 5;

        int zahl11 = 10;
        int zahl22 = 5;

        int ergebnis;

        ergebnis = zahl11 + zahl22; // 15
        System.out.println(ergebnis);

        ergebnis = zahl11 - zahl22; // 5
        System.out.println(ergebnis);

        ergebnis = zahl11 * zahl22; // 50
        System.out.println(ergebnis);

        ergebnis = zahl11 / zahl22; // 2
        System.out.println(ergebnis);

        varZahl++; // 6
        System.out.println(varZahl);

        varZahl--; // 5
        System.out.println(varZahl);

        int lebenGegner = 100;
        int geschossEnergie = 20;

        lebenGegner = lebenGegner - geschossEnergie;
        System.out.println(lebenGegner);

        // Zuweisungoperator
        lebenGegner -= geschossEnergie;
        System.out.println("LebenGegner: " + lebenGegner);

        /*
         * Die Vergleich Operatoren werden oft im Zusammenhang mit
         * if else Konstruktionen verwednet
         * Beispiel:
         *
         * if (Bedingung){
         *
         * 	Wenn die Bedingung true = also gleich wahr ist dann wird alles zwischen
         * {  ausgeführt }
         *
         * }
         *
         */
        // if = zu Deutsch falls
        // else ansonsten

        int endgamer = 0;
        boolean hit = false;

        int a = 3;
        int b = 3;
        boolean c; // 1. true 2. false



        c = a < b;
        System.out.println(c);

        if (endgamer == 0 || hit == true){ // (true)  oder (false)
            System.out.println("Gegner zerstört");
        }else {
            System.out.println("Gegner hat noch: " + endgamer + " Punkte");
        }

    }
}


