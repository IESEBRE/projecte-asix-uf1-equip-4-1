package com.iesebre;

import java.util.Scanner;

public class DosCaracters {
    Scanner scanner = new Scanner(System.in);

    // Constructor
    void DosCaracters (){}
    boolean talking () {
        System.out.println();
        System.out.print("Escriu dos caracters: ");
        String exercici4 = scanner.nextLine();
        String exercici4_1 = scanner.nextLine();
        System.out.println();
        System.out.print("Ho sentim, l'exercici no esta acabat, prova'n un altre. ");
        System.out.println();
        return false;
    }
}
