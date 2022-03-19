package org.vlagru;

public class Program {

    public static void main(String[] args) {

        Kostka kostka = new Kostka(10);
        Bojovnik bojovnik = new Bojovnik("Voloda",100, 20, 10, kostka);

//        System.out.printf("Bojovnik: %s\n", bojovnik);
//        System.out.printf("Nazivu: %s\n", bojovnik.nazivu());
        System.out.printf("Zivot: %s\n", bojovnik.grafickyZivot());

        Bojovnik souper = new Bojovnik("Kim Jong Il", 80, 25, 7, kostka);
        souper.utoc(bojovnik);
        System.out.println(souper.vratPosledniZpravu());
        System.out.println(bojovnik.vratPosledniZpravu());
        System.out.printf("Zivot: %s\n", bojovnik.grafickyZivot());

/**
 * Hazeni sestistennou a osmistennou kostkou
 */
//        Kostka sestistenna = new Kostka();
//        Kostka desetistenna = new Kostka(10);
//
//        System.out.println("\n");
//        System.out.println(sestistenna);
//        for (int i = 0; i < 10; i++) {
//            System.out.print(sestistenna.hod() + " ");
//        }
//        System.out.println("\n");
//
//
//        System.out.println(desetistenna);
//        for (int i = 0; i < 10; i++) {
//            System.out.print(desetistenna.hod() + " ");
//        }
//        System.out.println("\n");
//    }

    }
}