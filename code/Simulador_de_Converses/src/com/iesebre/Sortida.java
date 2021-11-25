package com.iesebre;

import java.util.Scanner;

public class Sortida {

    Scanner scanner = new Scanner(System.in);

    //Constructor
    void Sortida (){}
    boolean talking () {
        System.out.println();
        System.out.print("Voleu sortir de l'aplicacio? ");
        String surt = scanner.nextLine();
        if (surt.equals("Si") ) {
            return true;
        }
        else {
            return false;
        }
    }
}
