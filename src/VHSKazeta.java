public class VHSKazeta implements IAudio, IMedia {

    private String nazev;
    private Interpret interpret;
    private int rokVydani;
    private int pocetSkladeb;
    private String typ;




    public VHSKazeta(String nazev,int rokVydani,int pocetSkladeb,Interpret interpret,String typ){
        this.nazev = nazev;
        this.interpret = interpret;
        this.rokVydani = rokVydani;
        this.pocetSkladeb = pocetSkladeb;
        this.typ = typ;

    }
    public void vypisMediaInfo(){
        System.out.println("VHSKazeta s názvem " +getNazev()+ " byla vydána roku " +getRokVydani()+ " a má " +getPocetSkladeb()+ " skladeb");
    }


    public void vypisInterpretInfo() {
        System.out.println("Jméno interpreta je: " +interpret.getJmeno()+ " a narodil se roku: " +interpret.getRokNarozeni());

    }



    public int getRokVydani() {return rokVydani;}
    public String getNazev(){return nazev;}
    public int getPocetSkladeb(){return pocetSkladeb;}
    public String getTyp() {return typ;}
}
