package com.iesebre;

import java.util.Scanner;

public class Onomatopeies {
    Scanner scanner = new Scanner(System.in);

    // Constructor
    void Onomatopeies (){}
    boolean talking () {
        System.out.println();
        System.out.print("Escriu un caracter: ");
        String exercici3 = scanner.nextLine();
        System.out.println();
        System.out.print("Ho sentim, l'exercici no esta acabat, prova'n un altre. ");
        System.out.println();
        return false;
    }
}
