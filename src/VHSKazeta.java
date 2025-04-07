public class VHSKazeta implements IAudio, IMedia {

    private String nazev;
    Interpret interpret;
    private int rokVydani;
    private int pocetSkladeb;




    public VHSKazeta(String nazev,Interpret interpret){
        this.nazev = nazev;
        this.interpret = interpret;
        
        //we hate niggars
    }
    public void vypisMediaInfo(){
        System.out.println("Médium s názvem, ");
    }


    public void vypisInterpretInfo() {

    }

    public int getRokVydani() {return rokVydani;}
    public String getNazev(){return nazev;}
    public int getPocetSkladeb(){return pocetSkladeb;}
}
