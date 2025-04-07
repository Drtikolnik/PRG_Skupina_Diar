public class VHSKazeta implements IAudio, IMedia {

    private String nazev;
    Interpret interpret;
    private int rokVydani;
    private int pocetSkladeb;




    public VHSKazeta(String nazev,Interpret interpret,int rokVydani,int pocetSkladeb){
        this.nazev = nazev;
        this.interpret = interpret;
        this.rokVydani = rokVydani;
        this.pocetSkladeb = pocetSkladeb;

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
}
