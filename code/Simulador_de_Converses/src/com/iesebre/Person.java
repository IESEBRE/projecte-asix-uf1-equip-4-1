package com.iesebre;

import java.util.Scanner;

public class Person {
    // Constructor
    void Person (){}
    boolean talking () {
        Scanner scanner = new Scanner(System.in);
        boolean finishP = false;
        do {
            // Escollir la pregunta
            System.out.println();
            System.out.println("Selecciona un numero:");
            System.out.println("1- Quin tipus de persona ets? ");
            System.out.println("2- Quin esport t’agrada?");
            System.out.println("3- Quin és el teu número favorit entre 0 i ...?");
            System.out.println("4- Llista tots els nombres parells resultants de la multiplicació");
            System.out.println("5- Juguem a pedra paper i tisora?");
            System.out.println("6- Escriu el teu nom");
            System.out.println("7- Recordam la conversa");
            System.out.println("8- Surt de l'aplicacio");

            System.out.print("Opció: ");
            switch (scanner.nextLine()) {
                case "1":
                    TipusPersona tipus = new TipusPersona();
                    finishP = tipus.talking();
                    break;
                case "2":
                    Esport esport = new Esport();
                    finishP = esport.talking();
                    break;
                case "3":
                    NumeroFavorit favorit = new NumeroFavorit();
                    finishP = favorit.talking();
                    break;
                case "4":
                    NombresParells parells = new NombresParells();
                    finishP = parells.talking();
                    break;
                case "5":
                    PedraPaperTisora game = new PedraPaperTisora();
                    finishP = game.talking();
                    break;
                case "6":
                    PosaliNom nom = new PosaliNom();
                    finishP = nom.talking();
                    break;
                case "7":
                    RecordaConversa recorda = new RecordaConversa();
                    finishP = recorda.talking();
                    break;
                case "8":
                    Sortida foradaqui = new Sortida();
                    finishP = foradaqui.talking();
                    break;
            }
        } while (!finishP);
        return true;
    }
}
