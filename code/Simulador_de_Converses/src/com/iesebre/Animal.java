package com.iesebre;

import java.util.Scanner;

public class Animal {
    //Constructor
    void Animal() {
    }

    boolean talking() {
        Scanner scanner = new Scanner(System.in);
        boolean finishA = false;
        do {
            // Escollir la pregunta
            System.out.println();
            System.out.println("Selecciona un numero:");
            System.out.println("1- Quin tipus d’animal ets? ");
            System.out.println("2- A que t’agrada jugar? ");
            System.out.println("3- Quin és el teu caràcter favorit? ");
            System.out.println("4- Llista tots els caràcters amb valor Unicode: ");
            System.out.println("5- Juguem a fer onomatopeies? ");
            System.out.println("6- Escriu el teu nom");
            System.out.println("7- Recordam la conversa");
            System.out.println("8- Surt de l'aplicacio");

            System.out.print("Opció: ");
            switch (scanner.nextLine()) {
                case "1":
                    TipusAnimal tipus1 = new TipusAnimal();
                    finishA = tipus1.talking();
                    break;
                case "2":
                    JocAnimal esport1 = new JocAnimal();
                    finishA = esport1.talking();
                    break;
                case "3":
                    CaracterFavorit favorit1 = new CaracterFavorit();
                    finishA = favorit1.talking();
                    break;
                case "4":
                    DosCaracters parells1 = new DosCaracters();
                    finishA = parells1.talking();
                    break;
                case "5":
                    Onomatopeies game1 = new Onomatopeies();
                    finishA = game1.talking();
                    break;
                case "6":
                    PosaliNom nom1 = new PosaliNom();
                    finishA = nom1.talking();
                    break;
                case "7":
                    RecordaConversa recorda1 = new RecordaConversa();
                    finishA = recorda1.talking();
                    break;
                case "8":
                    Sortida foradaqui1 = new Sortida();
                    finishA = foradaqui1.talking();
                    break;
          }
            }
            while (!finishA) ;
            return true;
        }
    }

