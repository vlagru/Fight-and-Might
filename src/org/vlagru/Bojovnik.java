package org.vlagru;

public class Bojovnik {
    /** Jmeno bojovnika */
    private String jmeno;
    /** Zivot v HP */
    private int zivot;
    /** Maximalni zdravi */
    private int maxZivot;
    /** Utok v HP*/
    private int utok;
    /** Obrana */
    private int obrana;
    /** Instance hraci kostky */
    private Kostka kostka;

    public Bojovnik(String jmeno, int zivot,
                    int utok, int obrana, Kostka kostka) {
        this.jmeno = jmeno;
        this.zivot = zivot;
        this.maxZivot = zivot;
        this.utok = utok;
        this.obrana = obrana;
        this.kostka = kostka;
    }

    public boolean nazivu() {
        return (zivot > 0);
    }
    public String grafickyZivot() {
        String s = "[";
        int celkem = 20;
        //TODO zivot & zivotMax
        double pocet = Math.round(((double)zivot/maxZivot) * celkem);
        if((pocet == 0) && (nazivu())) {
            pocet = 1;
        }
        for (int i = 0; i < pocet; i++) {
            s += "#";
        }
        for (int i = 0; i < celkem - pocet; i++) {
            s += " ";
        }
        s += "]";
        return s;
    }

    @Override
    public String toString() {
        return jmeno;
    }
}
