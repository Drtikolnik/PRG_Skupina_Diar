public class CD implements IMedia {

    private String nazev;
    private int rokVydani;
    private int pocetSkladeb;
    Interpret interpret;

    public CD(String nazev, int rokVydani, int pocetSkladeb, Interpret interpret) {
        this.nazev = nazev;
        this.rokVydani = rokVydani;
        this.pocetSkladeb = pocetSkladeb;
        this.interpret = interpret;
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
