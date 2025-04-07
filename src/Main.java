import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean stop = false;

        Scanner sc = new Scanner(System.in);

        if (stop == false){
            System.out.println("1 - Vytvoření nového média");
            System.out.println("2 - Smazání média");
            System.out.println("3 - Vypsat médium");
            int x = sc.nextInt();
            switch (x){
                case 1:
                    System.out.println("1 - CD");
                    System.out.println("2 - DVD");
                    System.out.println("3 - Kniha");
                    System.out.println("4 - VHS");

                    break;
            }
        }



    }
}