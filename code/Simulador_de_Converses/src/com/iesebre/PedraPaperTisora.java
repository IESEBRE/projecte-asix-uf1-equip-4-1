package com.iesebre;

import java.util.Scanner;

public class PedraPaperTisora {
    Scanner scanner = new Scanner(System.in);

    // Constructor
    void PedraPaperTisora() {}
        boolean talking () {

            System.out.println();

            int seleccioMaquina = (int)(Math.random() * 3) + 1;
            System.out.println("La maquina ja ha escollit..");

            String Pe = "Pedra";
            String Pa = "Paper";
            String Ti = "Tisora";

            System.out.print("Indica la seva seleccio (1,2,3): ");
            int seleccionUsuario = scanner.nextInt();

            System.out.print("La maquina havia elegit: ");
            switch ( seleccioMaquina )
            {
                case 1:
                    System.out.println("Pedra");
                    switch ( seleccionUsuario )
                    {
                        case 1: System.out.println("Empat!"); break;
                        case 2: System.out.println("Tu guanyes!"); break;
                        case 3: System.out.println("La maquina guanya!"); break;
                    }
                    break;

                case 2:
                    System.out.println("Paper");
                    switch ( seleccionUsuario )
                    {
                        case 1: System.out.println("La maquina guanya!"); break;
                        case 2: System.out.println("Empat!"); break;
                        case 3: System.out.println("Tu guanyes!"); break;
                    }
                    break;

                case 3:
                    System.out.println("Tisora");
                    switch ( seleccionUsuario )
                    {
                        case 1: System.out.println("Tu guanyes!"); break;
                        case 2: System.out.println("La maquina guanya!"); break;
                        case 3: System.out.println("Empat!"); break;
                    }
                    break;
            }

            return true;
       }
}
