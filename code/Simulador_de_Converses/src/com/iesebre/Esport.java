package com.iesebre;

import java.util.Scanner;

public class Esport {
    Scanner scanner = new Scanner(System.in);

    // Constructor
    void Esport (){}
    boolean talking () {
        System.out.println();
        System.out.print("Escriu un numero de l'1 al 10:");

        int entrada = scanner.nextInt();

        switch (entrada) {
            case 1:
                System.out.println("Basquet");
                break;
            case 2:
                System.out.print("Futbol");
                break;
            case 3:
                System.out.print("Tenis");
                break;
            case 4:
                System.out.println("Padel");
                break;
            case 5:
                System.out.print("Golf");
                break;
            case 6:
                System.out.print("Badminton");
                break;
            case 7:
                System.out.println("Cricket");
                break;
            case 8:
                System.out.print("PimPom");
                break;
            case 9:
                System.out.print("Petanca");
                break;
            case 10:
                System.out.print("Karate");
                break;
        }
        return true;
    }
}
