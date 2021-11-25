package com.iesebre;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TipusAnimal {
    Scanner scanner = new Scanner(System.in);

    // Constructor
    void TipusAnimal (){}
    boolean talking () {
        System.out.println();
        System.out.print("Escriu un caracter: ");
        String nom = scanner.nextLine();

        byte[] nombytes = nom.getBytes(StandardCharsets.US_ASCII);

        char animal = nom.charAt(0);
        if (nombytes[0] >= 65 && nombytes[0] <= 74) {
            System.out.println("Gos");

        } else if (nombytes[0] >= 75 && nombytes[0] <= 79 || nombytes[0] == 63) {
            System.out.println("Mono");

        } else if (nombytes[0] >= 80 && nombytes[0] <= 90) {
            System.out.println("Serp");

        } else {
        return true;
    }
        return true;
    }
}
