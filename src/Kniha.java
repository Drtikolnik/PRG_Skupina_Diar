public class Kniha implements IMedia {

    private String nazev;
    private int rokVydani;
    private int pocetStran;
    private String typ;

    Kniha(String nazev, int rokVydani, int pocetStran,String typ){
        this.nazev = nazev;
        this.rokVydani = rokVydani;
        this.pocetStran = pocetStran;
    }



    public void vypisMediaInfo(){
        System.out.println("Kniha s názvem " +getNazev()+ " byla vydána roku " +getRokVydani()+ " a má " +getPocetStran()+ " stran");
    }

    public String getNazev() {return nazev;}
    public int getRokVydani() {return rokVydani;}
    public int getPocetStran() {return pocetStran;}
}

