package com.iesebre;

import java.lang.invoke.StringConcatFactory;
import java.util.Random;
import java.util.Scanner;

public class Person {
    // Constructor
    void Person() {}

    boolean[]ordre=new boolean[7];
    boolean talking() {

        System.out.println();
        System.out.println("Selecciona un numero:");

             //VARIABLES
        //Scanners
        Scanner entrada = new Scanner(System.in);
        byte pregunta;

        //nom
        String nom = "";

        //pedra paper tisora
        String jugada1;
        double jugada2;
        int puntuacio1 =0;
        int puntuacio2 = 0;
        String win = "";

        //multiplicacions
        int a;
        int b;

        //tipusdepersona
        int num = 0;
        String sexe = "";

        //esport
        int esport;
        String tria = "";

        //nombre preferit
        int entradaa = 0;
        int resultat;
        int iii;

        //sortida
        String opcio;

        //Guardant sortides
        String conversa1 = new String();
        String conversa2 = new String();
        String conversa3 = new String();
        String saveex3 = new String();
        String conversa4 = new String();
        String saveex4 = new String();
        String conversa6 = new String();

        //proces
        while (true) {
            System.out.println();
            System.out.println("1- Quin tipus de persona ets? ");
            System.out.println("2- Quin esport t’agrada?");
            System.out.println("3- Quin és el teu número favorit entre 0 i ...?");
            System.out.println("4- Llista tots els nombres parells resultants de la multiplicació");
            System.out.println("5- Juguem a pedra paper i tisora?");
            System.out.println("6- Escriu el teu nom");
            System.out.println("7- Recordam la conversa");
            System.out.println("8- Surt de l'aplicacio");
            System.out.print("Opcio (Numerica): ");


            pregunta = entrada.nextByte();

            switch (pregunta) {

                case 1:// 1
                    Scanner entrada1 = new Scanner(System.in);
                    System.out.println("Escriu un numero (0..100):");
                    num = entrada1.nextInt();
                    ordre[1]=true;
                    if (num % 2 == 0 && num % 3 == 0) {
                        System.out.println("No binari");
                        sexe = ("No binari");
                    } else {
                        if (num % 3 == 0) {
                            System.out.println("Dona");
                            sexe = ("Dona");
                        } else {
                                if (num % 2 == 0) System.out.println("Home");
                                sexe = ("Home");
                        }
                    }
                    conversa1 = sexe + "\n\n";
                    break;

                case 2://2
                    if (!ordre[1]){
                        System.out.println("Contesta abans la primera pregunta");
                        break;
                    }
                    else {
                        Scanner entrada2 = new Scanner(System.in);
                        System.out.print("Escriu un numero de l'1 al 10: ");
                        esport = entrada2.nextInt();
                        ordre[2]=true;
                        if (esport == 1) {
                            System.out.println("Hoquei");
                            tria = ("Hoquei");
                        }
                        if (esport == 2) {
                            System.out.println("Basquet");
                            tria = ("Basquet");
                        }
                        if (esport == 3) {
                            System.out.println("Handbol");
                            tria = ("Handbol");
                        }
                        if (esport == 4) {
                            System.out.println("Patinatge");
                            tria = ("Patinatge");
                        }
                        if (esport == 5) {
                            System.out.println("Rugbi");
                            tria = ("Ritmica");
                        }
                        if (esport == 6) {
                            System.out.println("Ritmica");
                            tria = ("Natacio");
                        }
                        if (esport == 7) {
                            System.out.println("Natacio");
                            tria = ("Natacio");
                        }
                        if (esport == 8) {
                            System.out.println("Judo");
                            tria = ("Judo");
                        }
                        if (esport == 9) {
                            System.out.println("Atletisme");
                            tria = ("Atletisme");
                        }
                        if (esport == 10) {
                            System.out.println("Ciclisme");
                            tria = ("Ciclisme");
                        }
                    }
                    conversa2 = tria + "\n\n";

                    break;

                case 3://3
                    if (!ordre[2]){
                        System.out.println("Contesta abans la ultima pregunta");
                        break;
                    }
                    else {
                        Scanner entrada3 = new Scanner(System.in);
                        System.out.println();
                        System.out.print("Escriu el teu numero favorit: ");
                        entradaa = entrada3.nextInt();
                        ordre[3] = true;
                        resultat = entradaa / 2;
                        iii = 0;

                        while (resultat != iii) {
                            System.out.print(iii + " ");
                            saveex3 +=iii + " ";
                            ++iii;

                        }
                        System.out.print("...He triat el " + resultat + "!");
                        conversa3 = saveex3 + "...He triat el " + resultat + "!" + "\n\n";
                    }


                    break;

                case 4://4
                    if (!ordre[3]){
                        System.out.println("Contesta abans la ultima pregunta");
                        break;
                    }
                    else {
                        Scanner entrada4 = new Scanner(System.in);
                        System.out.print("Escriu dos nombres per multiplicar: ");
                        a = entrada4.nextInt();
                        b = entrada4.nextInt();
                        ordre[4] = true;
                        for (int i = a; i <= b; i++) {
                            System.out.println();
                            for (int j = b; j >= 1; j--) {
                                if ((i * j) % 2 == 0) System.out.print(i * j + "  ");
                                saveex4 += i * j + "  ";
                            }
                            System.out.println();
                        }
                        conversa4 = saveex4 + "\n\n";

                    }

                    break;

                case 5://5
                    if (!ordre[4]){
                        System.out.println("Contesta abans la ultima pregunta");
                        break;
                    }
                    else {
                        Scanner entrada5 = new Scanner(System.in);
                        while (puntuacio1 < 5 || puntuacio2 < 5) {
                            System.out.print("Digues Pedra, Paper o Tisora una de les 3: ");
                            jugada1 = entrada5.nextLine();
                            jugada2 = new Random().nextInt(3) + 1;
                            ordre[5] = true;
                            System.out.println(jugada2);
                            //1 es paper 2 es pedra 3 es tisores
                            if ((jugada1.equals("Pedra") && jugada2 == 1) || (jugada1.equals("Tisora") && jugada2 == 2) || (jugada1.equals("Paper") && jugada2 == 3)) {
                                puntuacio1++;
                                System.out.println("Jugador1");
                            } else {
                                if ((jugada2 == 2 && jugada1.equals("Paper")) || (jugada2 == 3 && jugada1.equals("Pedra")) || (jugada2 == 1 && jugada1.equals("Tisora"))) {
                                    puntuacio2++;
                                    System.out.println("Jugador2");

                                } else if ((jugada1.equals("Pedra") && jugada2 == 2) || (jugada1.equals("Tisora") && jugada2 == 3) || (jugada1.equals("Paper") && jugada2 == 2)) {
                                    puntuacio1++;
                                    puntuacio2++;
                                    System.out.println("Empat");
                                }
                            }
                            if (puntuacio1 == 5) {
                                System.out.println("Has guanyat");
                                win = ("Tu");
                                break;
                            } else if (puntuacio2 == 5) {
                                System.out.println("Has perdut");
                                win = ("el contrari");
                                break;
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 6://6
                    if (!ordre[5]){
                        System.out.println("Contesta abans la ultima pregunta");
                        break;
                    }
                    else {
                        Scanner entrada6 = new Scanner(System.in);
                        System.out.print("Escriu el teu nom: ");
                        nom = entrada6.nextLine();
                        ordre[6] = true;
                        System.out.println("Gràcies, m'agrada el nom de "+ nom);
                        conversa6 ="Gràcies, m'agrada el nom de " + nom + "\n\n";
                    }
                    break;

                case 7://7

                    if (!ordre[6]){
                        System.out.println("Contesta abans la ultima pregunta");
                        break;
                    }
                    System.out.println(conversa1 + conversa2 + conversa3 + conversa4 + conversa6);

                    System.out.println("Hem dic " + nom + " i he nascut " + sexe + ". El meu esport preferit es " + tria + ". El meu número favorit és el " + entradaa + ".");


                    break;

                case 8://8

                        Scanner entrada8 = new Scanner(System.in);
                        System.out.println("Voleu sortir de l'aplicacio?");
                        opcio = entrada8.nextLine();
                        if (opcio.equals("Si")) {
                            return true;
                        }
                        if (opcio.equals("No")) {
                            break;
                        }
            }
        }
    }
}
