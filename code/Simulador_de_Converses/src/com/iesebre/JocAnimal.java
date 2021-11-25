package com.iesebre;

import java.util.Scanner;

public class JocAnimal {
    Scanner scanner = new Scanner(System.in);

    // Constructor
    void JocAnimal (){}
    boolean talking () {
        System.out.println();
        System.out.print("Escriu un caracter de la A a la J: ");
        String enter = scanner.nextLine();

        switch (enter) {
            case "A":
                System.out.println("PILLA PILLA...ANIMAL");
                break;
            case "B":
                System.out.println("ENDEVINA EL ANIMAL");
                break;
            case "C":
                System.out.println("MATA PATOS");
                break;
            case "D":
                System.out.println("LA ARAÑA");
                break;
            case "E":
                System.out.println("ANIMAL AMONG US");
                break;
            case "F":
                System.out.println("EL JOC DE LA SERP");
                break;
            case "G":
                System.out.println("LA OCA");
                break;
            case "H":
                System.out.println("LOBO ENTRE CORDEROS");
                break;
            case "I":
                System.out.println("LA GALLINA CEGA");
                break;
            case "J":
                System.out.println("ANIMAL RACE");
                break;
        }
        return true;
    }
}
