
package com.iesebre;

import java.util.Scanner;

public class NumeroFavorit {
    Scanner scanner = new Scanner(System.in);

    // Constructor
    void NumeroFavorit() {
    }

    boolean talking() {
        System.out.println();
        System.out.print("Escriu el teu numero favorit:");
        int entrada = scanner.nextInt();
        int resultat = entrada / 2;
        int i = 0;

        while (resultat != i){
            System.out.println(i);
            ++i;
        }
        System.out.println(resultat);
        return true;
    }
}

