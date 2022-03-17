package org.vlagru;

public class TahovyBoj {

    public static void main(String[] args) {

        Kostka sestistenna = new Kostka();
        Kostka desetistenna = new Kostka(10);

        System.out.println("\n");
        System.out.println(sestistenna);
        for (int i = 0; i < 10; i++) {
            System.out.print(sestistenna.hod() + " ");
        }
        System.out.println("\n");


        System.out.println(desetistenna);
        for (int i = 0; i < 10; i++) {
            System.out.print(desetistenna.hod() + " ");
        }
        System.out.println("\n");
    }
}
