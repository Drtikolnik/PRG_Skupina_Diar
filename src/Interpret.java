import java.util.Scanner;
public class Interpret {
    Scanner sc = new Scanner(System.in);

    private String jmeno;
    private int rokNarozeni;


    public Interpret(String jmeno, int rokNarozeni) {
        this.jmeno = jmeno;
        this.rokNarozeni = rokNarozeni;
    }

    public String getJmeno() {return jmeno;};
    public int getRokNarozeni() {return rokNarozeni;};


    public void vypisInterpretInfo(){
        System.out.println(getJmeno() + " " + getRokNarozeni());
    }

}
