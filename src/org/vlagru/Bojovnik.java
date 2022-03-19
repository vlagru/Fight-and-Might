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
    /** Vraci zpravy o utoku a obrane */
    private String zprava;

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
        //TODO zivot & zivotMax, zjistit detaily
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

    /**
     * Obrana soupere pred utokem bojovnika (viz reference).
     * @param uder
     */
    public void branSe(int uder) {
        int zraneni = uder - (obrana + kostka.hod());
        if (zraneni > 0) {
            zivot -= zraneni;
            zprava = String.format("%s utrpel poskozeni %s hp", jmeno, zraneni);
            if (zivot <= 0) {
                zivot = 0;
                zprava += " a zemrel";
            }
        }
        else zprava = String.format("%s odrazil utok", jmeno);
        nastavZpravu(zprava); // TODO proc je zprava ulozena v else a nikoliv po ukonceni cele podminky?
    }

    /**
     * Obe reference 'bojovnik' a 'souper' ukazuji na spolecnou referenci 'bojovnik'.
     * Utok bojovnika na soupere, tedy 'Volodi' na 'Volodu'.
     * @param
     */
    public void utoc(Bojovnik bojovnik) {
        int uder = utok + kostka.hod();
        nastavZpravu(String.format("%s utoci uderem za %s hp", jmeno, uder));
        bojovnik.branSe(uder);
    }

    //TODO : Zjistit, proc 'konstruktor' tohoto typu je 'private' a nenese jmeno tridy.
    private void nastavZpravu(String zprava) {
        this.zprava = zprava;
    }

    /**
     * Vraci zpravu o utoku a obrane bojovnika a soupere.
     * @return Vraci zpravu o utoku a obrane bojovnika a soupere.
     */
    public String vratPosledniZpravu() {
        return zprava;
    }

    @Override
    public String toString() {
        return jmeno;
    }
}
