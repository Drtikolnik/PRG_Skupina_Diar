import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<IMedia> zarizeni = new ArrayList<>();

        boolean stop = false;
        if (stop == false) {
            for (int i = 2; i > 1; i++) {
                System.out.println("1 - Vytvoření nového média");
                System.out.println("2 - Smazání média");
                System.out.println("3 - Vypsat médium");
                int e = sc.nextInt();
                switch (e) {
                    case 1:
                        System.out.println("Co chceš přidat");
                        System.out.println("1 - CD");
                        System.out.println("2 - DVD");
                        System.out.println("3 - Kniha");
                        System.out.println("4 - VHS");
                        int x = sc.nextInt();
                        switch (x) {
                            case 1:
                                System.out.println("Kolik CD chceš zadat?");
                                int CDCount = sc.nextInt();
                                sc.nextLine();
                                for (int l = 0; l < CDCount; l++) {
                                    System.out.println("Jaký je název CD?");
                                    String nazev = sc.nextLine();
                                    System.out.println("Jaký je rok vydání CD?");
                                    int rokVydani = sc.nextInt();
                                    sc.nextLine();
                                    System.out.println("Jaký je počet skladeb CD?");
                                    int pocetSkladeb = sc.nextInt();
                                    sc.nextLine();

                                    if(pocetSkladeb > 0){
                                        System.out.println("Jaké jméno má interpret?");
                                        String jmeno = sc.nextLine();
                                        System.out.println("Jaký je rok narození interpreta?");
                                        int rokNarozeni = sc.nextInt();
                                        sc.nextLine();
                                        Interpret interpret = new Interpret(jmeno,rokNarozeni);

                                        zarizeni.add(new CD(nazev,rokVydani,pocetSkladeb,interpret,"CD"));
                                    }
                                    else{
                                        System.err.println("Nelze");
                                    }
                                }

                                break;
                            case 2:
                                System.out.println("Kolik DVD chceš zadat?");
                                int DVDCount = sc.nextInt();
                                sc.nextLine();
                                for (int o = 0; o < DVDCount; o++) {
                                    System.out.println("Jaký je název DVD?");
                                    String nazev = sc.nextLine();
                                    System.out.println("Jaký je rok vydání DVD?");
                                    int rokVydani = sc.nextInt();
                                    sc.nextLine();
                                    System.out.println("Jaký je počet skladeb DVD?");
                                    int delkaTrvani = sc.nextInt();
                                    sc.nextLine();

                                    if(delkaTrvani > 0){
                                        zarizeni.add(new DVD(nazev,rokVydani,delkaTrvani,"DVD"));
                                    }
                                    else{
                                        System.err.println("Nelze");
                                    }
                                }
                                break;


                            case 3:
                                System.out.println("Kolik Knih chceš zadat?");
                                int KnihaCount = sc.nextInt();
                                sc.nextLine();
                                for (int p = 0; p < KnihaCount; p++) {
                                    System.out.println("Jaký je název knihy?");
                                    String nazev = sc.nextLine();
                                    System.out.println("Jaký je rok vydání knihy?");
                                    int rokVydani = sc.nextInt();
                                    sc.nextLine();
                                    System.out.println("Jaký je počet stran knihy?");
                                    int pocetStran = sc.nextInt();
                                    sc.nextLine();

                                    if(pocetStran > 0){
                                        zarizeni.add(new Kniha(nazev,rokVydani,pocetStran,"Kniha"));
                                    }
                                    else{
                                        System.err.println("Nelze");
                                    }
                                }
                                break;
                            case 4:
                                System.out.println("Kolik VHS chceš zadat?");
                                int VHSCount = sc.nextInt();
                                sc.nextLine();
                                for (int l = 0; l < VHSCount; l++) {
                                    System.out.println("Jaký je název VHS kazety?");
                                    String nazev = sc.nextLine();
                                    System.out.println("Jaký je rok vydání VHS kazety?");
                                    int rokVydani = sc.nextInt();
                                    sc.nextLine();
                                    System.out.println("Jaký je počet skladeb VHS kazety?");
                                    int pocetSkladeb = sc.nextInt();
                                    sc.nextLine();

                                    if(pocetSkladeb > 0){
                                        System.out.println("Jaké jméno má interpret?");
                                        String jmeno = sc.nextLine();
                                        System.out.println("Jaký je rok narození interpreta?");
                                        int rokNarozeni = sc.nextInt();
                                        sc.nextLine();
                                        Interpret interpret = new Interpret(jmeno,rokNarozeni);

                                        zarizeni.add(new VHSKazeta(nazev,rokVydani,pocetSkladeb,interpret,"VHS"));
                                    }
                                    else{
                                        System.err.println("Nelze");
                                    }
                                }
                                break;
                            default:
                                System.err.println("Špatně");
                                break;
                        }

                        break;
                    case 2:
                        System.out.println("Co chceš smazat");
                        System.out.println("1 - CD");
                        System.out.println("2 - DVD");
                        System.out.println("3 - Kniha");
                        System.out.println("4 - VHS");
                        int y = sc.nextInt();
                        switch (y) {
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            default:
                                System.err.println("Špatně");
                                break;
                        }

                        break;
                    case 3:
                        System.out.println("Co chceš vypsat");
                        System.out.println("1 - Všechno");
                        System.out.println("2 - Specifické médium");
                        System.out.println("3 - Nejstarší a nejnovější");
                        System.out.println("4 - Nejstarší Kniha");
                        System.out.println("5 - Počet všech médií");
                        System.out.println("6 - Info interpretů CD a VHS");
                        System.out.println("7 - Počet druhů médií");
                        System.out.println("8 - Nejkratší DVD");
                        System.out.println("9 - Název CD nejmladšího autora + rok narození autora");
                        int z = sc.nextInt();
                        switch (z) {
                            case 1:
                                for (IMedia zar : zarizeni){
                                    zar.vypisMediaInfo();
                                }

                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:

                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                break;
                            case 9:
                                break;
                            default:
                                System.err.println("Špatně");
                                break;
                        }

                        break;
                    default:
                        System.err.println("grrrrrrrrrrrr");
                        System.err.println("Blowing up an orphanage in ");
                        System.err.println("10");
                        System.err.println("9");
                        System.err.println("8");
                        System.err.println("7");
                        System.err.println("6");
                        System.err.println("5");
                        System.err.println("4");
                        System.err.println("3");
                        System.err.println("2");
                        System.err.println("1");
                        System.err.println("boom");
                        break;
                }
            }
        }


    }
}