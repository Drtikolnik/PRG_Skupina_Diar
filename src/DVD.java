public class DVD implements IMedia{

    private String nazev;
    private int rokVydani;
    private int delkaTrvani;
    private String typ;


    public DVD (String nazev, int rokVydani,int delkaTrvani, String typ) {
        this.nazev = nazev;
        this.rokVydani = rokVydani;
        this.delkaTrvani = delkaTrvani;
    }

    public void vypisMediaInfo(){
        System.out.println("DVD s názvem " +getNazev()+ " bylo vydáno roku " +getRokVydani()+ " a má délku trvání " +getDelkaTrvani()+ " (minut)");
    }


    public String getNazev() {return nazev;}
    public int getRokVydani() {return rokVydani;}
    public int getDelkaTrvani() {return delkaTrvani;}

}
