import java.util.Scanner;
public class CD implements IAudio, IMedia {
    Scanner sc = new Scanner(System.in);

    private String nazev;
    private int rokVydani;
    private int pocetSkladeb;
    private Interpret interpret;
    private String typ = "CD";

    public CD(String nazev, int rokVydani, int pocetSkladeb,Interpret interpret, String typ) {
        this.nazev = nazev;
        this.rokVydani = rokVydani;
        this.pocetSkladeb = pocetSkladeb;
        this.interpret = interpret;
        this.typ = typ;
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
    public String getTyp() {return typ;}
}