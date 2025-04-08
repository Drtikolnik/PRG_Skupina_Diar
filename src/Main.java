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
                    case 1://přidání
                        System.out.println("Co chceš přidat");
                        System.out.println("1 - CD");
                        System.out.println("2 - DVD");
                        System.out.println("3 - Kniha");
                        System.out.println("4 - VHS");
                        int x = sc.nextInt();
                        sc.nextLine();
                        switch (x) {
                            case 1://CD
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
                            case 2://DVD
                                System.out.println("Kolik DVD chceš zadat?");
                                int DVDCount = sc.nextInt();
                                sc.nextLine();
                                for (int o = 0; o < DVDCount; o++) {
                                    System.out.println("Jaký je název DVD?");
                                    String nazev = sc.nextLine();
                                    System.out.println("Jaký je rok vydání DVD?");
                                    int rokVydani = sc.nextInt();
                                    sc.nextLine();
                                    System.out.println("Jaká je doba trvání DVD?");
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


                            case 3://Kniha
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
                            case 4://VHS
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

                                        zarizeni.add(new VHSKazeta(nazev,rokVydani,pocetSkladeb,interpret,"VHSKazeta"));
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
                    case 2://smazání
                        System.out.println("Jaké zařízení by jsi chtěl vymazat? - číslo 1 pro 1. zařízení atd.");
                        int q = 1;
                        for (IMedia zar : zarizeni){
                            System.out.print(q+ " - "); zar.vypisMediaInfo();
                            q++;
                        }
                        int smazat = sc.nextInt() -1;
                        sc.nextLine();
                        if (smazat>0&&smazat<zarizeni.size()){
                            zarizeni.remove(smazat);
                            break;
                        }
                        else {
                            System.err.println("Špatně");
                            break;
                        }

                    case 3://výpis
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
                                for (IMedia zar : zarizeni) {
                                    zar.vypisMediaInfo();
                                }

                                break;
                            case 2: //vypis zadaného typu zařízení
                                System.out.println("Jaký typ zařízení chceš vypsat?");
                                System.out.println("1 - CD");
                                System.out.println("2 - DVD");
                                System.out.println("3 - Kniha");
                                System.out.println("4 - VHS");
                                int vyberZarizeni = sc.nextInt();
                                sc.nextLine();
                                switch (vyberZarizeni) {
                                    case 1:
                                        int jestliCD = 0;
                                        for (IMedia zar : zarizeni) {
                                            if (zar.getTyp().equals("CD")) {
                                                zar.vypisMediaInfo();
                                                jestliCD++;
                                            }
                                        }
                                        if (jestliCD == 0) {
                                            System.out.println("Zařízení typu CD neexistuje");
                                        }
                                        break;

                                    case 2:
                                        int jestliDVD = 0;
                                        for (IMedia zar : zarizeni) {
                                            if (zar.getTyp().equals("DVD")) {
                                                zar.vypisMediaInfo();
                                                jestliDVD++;
                                            }
                                        }
                                        if (jestliDVD == 0) {
                                            System.out.println("Zařízení typu DVD neexistuje");
                                        }
                                        break;

                                    case 3:
                                        int jestliKniha = 0;
                                        for (IMedia zar : zarizeni) {
                                            if (zar.getTyp().equals("Kniha")) {
                                                zar.vypisMediaInfo();
                                                jestliKniha++;
                                            }
                                        }
                                        if (jestliKniha == 0) {
                                            System.out.println("Zařízení typu Kniha neexistuje");
                                        }
                                        break;

                                    case 4:
                                        int jestliVHSKazeta = 0;
                                        for (IMedia zar : zarizeni) {
                                            if (zar.getTyp().equals("VHSKazeta")) {
                                                zar.vypisMediaInfo();
                                                jestliVHSKazeta++;
                                            }
                                        }
                                        if (jestliVHSKazeta == 0) {
                                            System.out.println("Zařízení typu VHS Kazeta neexistuje");
                                        }
                                        break;
                                    default:
                                        System.err.println("Špatné zadané číslo");
                                        break;
                                }
                                break;

                            case 3://nejstarší a nejnovější

                                IMedia nejstarsi = zarizeni.get(0);
                                IMedia nejnovejsi = zarizeni.get(0);

                                for (IMedia zar : zarizeni) {
                                    if (zar.getRokVydani() < nejstarsi.getRokVydani()) {
                                        nejstarsi = zar;
                                    }
                                    if (zar.getRokVydani() > nejnovejsi.getRokVydani()) {
                                        nejnovejsi = zar;
                                    }
                                }

                                System.out.println("Nejstarší: ");
                                nejstarsi.vypisMediaInfo();
                                System.out.println("Nejnovější: ");
                                nejnovejsi.vypisMediaInfo();

                                break;
                            case 4:
                                IMedia nejstarsiKniha = null;
                                for (IMedia zar : zarizeni) {
                                    if (zar instanceof Kniha) {

                                        if (nejstarsiKniha == null || zar.getRokVydani() < ((Kniha) nejstarsiKniha).getRokVydani()) {
                                            nejstarsiKniha = zar;
                                        }

                                    }
                                }
                                System.out.println("Nejstarší kniha je " + nejstarsiKniha.getNazev() + " s rokem vydání " + ((Kniha) nejstarsiKniha).getRokVydani());

                                break;


                            case 5:
                                System.out.println("Počet všech uložených médií je: "+zarizeni.size());
                                break;

                            case 6:
                                for (IMedia neco : zarizeni) {
                                    if (neco.getTyp().equals("CD") || (neco.getTyp().equals("VHSKazeta")) ) {
                                        IAudio interpret = (IAudio) zarizeni;
                                        interpret.vypisInterpretInfo();

                                    }
                                }
                                break;

                            case 7:
                                int countKniha = 0;
                                int countCD = 0;
                                int countDVD = 0;
                                int countVHSKazeta = 0;
                                for (IMedia zar : zarizeni) {

                                    if (zar.getTyp().equals("Kniha")) {
                                        countKniha++;
                                    }
                                    else if (zar.getTyp().equals("CD")){
                                        countCD++;
                                    }
                                    else if (zar.getTyp().equals("DVD")){
                                        countDVD++;
                                    }
                                    else{
                                        countVHSKazeta++;
                                    }
                                }
                                System.out.println("Počet zařízení:");
                                System.out.println("CD: " +countCD);
                                System.out.println("DVD:" +countDVD);
                                System.out.println("Kniha:" +countKniha);
                                System.out.println("VHS:" +countVHSKazeta);
                                break;
                            case 8:
                                IMedia nejkratsiDVD = null;

                                for (IMedia nejkrat : zarizeni) {
                                    if (nejkrat.getTyp().equals("DVD")) {
                                        DVD dvd = (DVD) nejkrat;
                                        if (nejkratsiDVD == null || dvd.getDelkaTrvani() < ((DVD) nejkratsiDVD).getDelkaTrvani()) {
                                            nejkratsiDVD = nejkrat;

                                        }
                                    }
                                }


                                System.out.println("nejkratší dvd je: " + nejkratsiDVD.getNazev() + " s délkou: " + ((DVD) nejkratsiDVD).getDelkaTrvani() );
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
                        System.err.println("!yay!");
                        System.err.println("😛");

                        break;
                }
            }
        }


    }
}