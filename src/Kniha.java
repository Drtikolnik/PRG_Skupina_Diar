public class Kniha implements IMedia {

    private String nazev;
    private int rokVydani;
    private int pocetStran;

    Kniha(String nazev, int rokVydani, int pocetStran){
        this.nazev = nazev;
        this.rokVydani = rokVydani;
        this.pocetStran = pocetStran;
    }

    public String getNazev() {

        return nazev;
    }

    public int getRokVydani() {
        return rokVydani;
    }

    public void vypisMediaInfo() {

    }
}

