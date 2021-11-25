package com.iesebre;

import java.util.Scanner;

public class NombresParells {
    Scanner scanner = new Scanner(System.in);

    // Constructor
    void NombresParells() {}
        boolean talking () {
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            System.out.print("Escriu dos nombres per multiplicar: ");

            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            for (int i = num1; i <= num2; i++) {
                System.out.println();
                for (int j = num2; j >= 1; j--) {
                    if ((i * j) % 2 == 0) System.out.print(i * j + "  ");
                }
            }
            System.out.println();
            return true;
        }
}
