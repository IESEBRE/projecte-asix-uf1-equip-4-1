package com.iesebre;

import java.util.Scanner;

public class PosaliNom {

    Scanner scanner = new Scanner(System.in);

    //Constructor
    void PosaliNom (){}
    boolean talking () {
        System.out.print ("Escriu el teu nom: ");
        String nom = scanner.nextLine();
        System.out.print ("Gràcies, m’agrada aquest nom");
        return true;
    }
}
