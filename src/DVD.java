public class DVD implements IMedia{

    private String nazev;
    private int rokVydani;
    private int delkaTrvani;


    public DVD (String nazev, int rokVydani,int delkaTrvani) {
        this.nazev = nazev;
        this.rokVydani = rokVydani;
        this.delkaTrvani = delkaTrvani;
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
