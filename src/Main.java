import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean stop = false;

        Scanner sc = new Scanner(System.in);

        if (stop == false){
            System.out.println("1 - Vytvoření nového média");
            System.out.println("2 - Smazání média");
            System.out.println("3 - Vypsat médium");
            int e = sc.nextInt();
            switch (e){
                case 1:
                    System.out.println("Co chceš přidat");
                    System.out.println("1 - CD");
                    System.out.println("2 - DVD");
                    System.out.println("3 - Kniha");
                    System.out.println("4 - VHS");
                    int x = sc.nextInt();
                    switch (x){
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
                case 2:
                    System.out.println("Co chceš smazat");
                    System.out.println("1 - CD");
                    System.out.println("2 - DVD");
                    System.out.println("3 - Kniha");
                    System.out.println("4 - VHS");
                    int y = sc.nextInt();
                    switch (y){
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
                    switch (z){
                        case 1:
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