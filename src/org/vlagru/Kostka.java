package org.vlagru;

import java.util.Random;

public class Kostka {

    private int pocetSten;
    private Random random;

    /**
     * konstruktor pro 'sestistennou' kostku
     */
    public Kostka() {
        pocetSten = 6;
        random = new Random();
    }

    /**
     * konstruktor pro 'desetistennou' kostku, parametr zadavam primo do nove instatnce
     * @param pocetSten
     */
    public Kostka(int pocetSten) {
        this.pocetSten = pocetSten;
        random = new Random();
    }


    /**
     *
     * @return Pocet sten kostky na zaklade pretezovani dvou konstruktoru pro 6 a 10-stennou kostku
     */
    public int vratPocetSten() {
        return pocetSten;
    }

    /**
     * Hodi 6 nebo 10-stennou kostkou
     * @return Metodu nextInt(DO) tridy Random : od 0 do stanoveneho poctu - 1
     */
    public int hod() {
        return random.nextInt(pocetSten) + 1;
    }

    /**
     * Vraci textovou reprezentaci kostky
     * @return Textova reprezentace kostky zformatovana metodou 'format', jinak se zobrazi hash a spol.
     */
    @Override
    public String toString() {
        return String.format("Kostka s %s stenami", pocetSten);
    }
}

