/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad3;

import java.util.Scanner;

/**
 *
 * @author tychu
 */
public class Main {

    public static void main(String[] args) {

        Complex zespolona = new Complex(0, 0);

        Scanner we = new Scanner(System.in);

        System.out.println("Podaj część rzeczywistą liczby zespolonej: ");
        double r = zespolona.wpisz();
        System.out.println("Podaj część urojoną liczby zespolonej: ");
        double u = zespolona.wpisz();
        System.out.print("Podana liczba zespolona to: ");
        zespolona.wypisz(r, u);

        double modul = zespolona.modul(r, u);
        System.out.println("\nModuł podanej liczby zespolonej wynosi: " + modul);

        System.out.print("\nLiczba sprzężona do podanej liczby zespolonej to: ");
        zespolona.sprzezona(r, u);

        zespolona.trygonometryczna(r, u);
        zespolona.algebraicznaNaWykladnicza(r, u);

        System.out.println("\nPodaj wartość modułu liczby zespolonej: ");
        double mod = zespolona.wpisz();
        System.out.println("Podaj wartość kąta alfa liczby zespolonej: ");
        double alfa = zespolona.wpisz();
        System.out.print("Podana liczba zespolona to: ");
        System.out.println(mod + " * e^" + alfa + "i");

        zespolona.wykladniczaNaAlgebraiczna(alfa, mod);

        System.out.println("Wprowadź dwie liczby zespolone w postaci algebraicznej, a następnie wybierzesz co chcesz z nią zrobić");

        System.out.println("\n\nPodaj część rzeczywistą pierwszej liczby zespolonej: ");
        double r1 = zespolona.wpisz();
        System.out.println("Podaj część urojoną pierwszej liczby zespolonej: ");
        double u1 = zespolona.wpisz();
        System.out.print("Pierwsza liczba zespolona to: ");
        zespolona.wypisz(r1, u1);

        System.out.println("Podaj część rzeczywistą drugiej liczby zespolonej: ");
        double r2 = zespolona.wpisz();
        System.out.println("Podaj część urojoną drugiej liczby zespolonej: ");
        double u2 = zespolona.wpisz();
        System.out.print("Druga liczba zespolona to: ");
        zespolona.wypisz(r2, u2);

        System.out.println("Wybierz co chcesz z nią zrobić: \n1.Dodawanie\n2.Odejmowanie\n3.Mnożenie\n4.Dzielenie\n");
        int n = we.nextInt();
        switch (n) {

            case 1:
                zespolona.dodawanieAlgebraiczna(r1, u1, r2, u2);
                break;
            case 2:
                zespolona.odejmowanieAlgebraiczna(r1, u1, r2, u2);
                break;
            case 3:
                zespolona.mnozenieAlgebraiczna(r1, u1, r2, u2);
                break;
            case 4:
                zespolona.dzielenieAlgebraiczna(r1, u1, r2, u2);
                break;
            default:
                System.out.println("Wybrano cyfrę spoza przedziału <1,4>");
        }

        System.out.println("\nWprowadź dwie liczby zespolone w postaci wykladniczej, a następnie wybierzesz co chcesz z nią zrobić");

        System.out.println("Podaj wartość modułu liczby zespolonej: ");
        double mod1 = zespolona.wpisz();
        System.out.println("Podaj wartość kąta alfa liczby zespolonej: ");
        double alfa1 = zespolona.wpisz();
        System.out.print("Pierwsza liczba zespolona to: ");
        System.out.println(mod + " * e^" + alfa + "i");

        System.out.println("\n\nPodaj wartość modułu liczby zespolonej: ");
        double mod2 = zespolona.wpisz();
        System.out.println("Podaj wartość kąta alfa liczby zespolonej: ");
        double alfa2 = zespolona.wpisz();
        System.out.print("Druga liczba zespolona to: ");
        System.out.println(mod + " * e^" + alfa + "i");

        System.out.println("Wybierz co chcesz z nią zrobić: \n1.Dodawanie\n2.Dzielenie\n");
        n = we.nextInt();
        switch (n) {

            case 1:
                zespolona.dodawanieWykladnicza(mod1, alfa1, mod2, alfa2);
                break;
            case 2:
                zespolona.dzielenieWykladnicza(mod1, alfa1, mod2, alfa2);
                break;
            default:
                System.out.println("Wybrano cyfrę spoza przedziału <1,4>");
        }

    }
}
