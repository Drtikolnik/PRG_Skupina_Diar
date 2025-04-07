public class CD implements IAudio, IMedia {

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


    public void vypisMediaInfo(){
        System.out.println("CD s názvem " +getNazev()+ " bylo vydáno roku " +getRokVydani()+ " a má " +getPocetSkladeb()+ " skladeb");
    }


    public void vypisInterpretInfo() {
        System.out.println("Jméno interpreta je: " +interpret.getJmeno()+ " a narodil se roku: " +interpret.getRokNarozeni());

    }

    public int getRokVydani() {return rokVydani;}
    public String getNazev(){return nazev;}
    public int getPocetSkladeb(){return pocetSkladeb;}
}