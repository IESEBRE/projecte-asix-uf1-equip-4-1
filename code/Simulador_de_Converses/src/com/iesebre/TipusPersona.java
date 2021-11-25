package com.iesebre;

import java.util.Scanner;

public class TipusPersona {
    Scanner scanner = new Scanner(System.in);

        // Constructor
        void TipusPersona (){}
        boolean talking () {
            System.out.println();
            System.out.print("Escriu un numero (0..100):");
            int entrada = scanner.nextInt();

boolean fi =false;
while (!fi){
    if (entrada % 2 == 0 && entrada % 3 == 0) {
        System.out.println("No binari");
        fi= true;
    } else if (entrada % 2 == 0) {
        System.out.println("Home");
        fi= true;
    } else if (entrada % 3 == 0) {
        System.out.println("Dona");
        fi= true;
    } else {
        entrada = entrada + 2;
        if (entrada > 100) {
            entrada = entrada - 4;
        }
    }
}
return true;
    }
}
