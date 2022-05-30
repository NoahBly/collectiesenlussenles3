import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numeric = {1,2,3,4,5,6,7,8,9,0} ;
        // System.out.println(numeric[0]);
        String[] alphabetic = {"een","twee","drie","vier","vijf","zes","zeven","acht","negen","nul"} ;


        translator translatorz = new translator(numeric,alphabetic);

        boolean play = true;
        String input = "";
        int number = 0;
        String ongeldig = "Ongeldige invoer";

        Scanner scanner = new Scanner(System.in);


        while(play = true) {
            System.out.println("Typ x om te stoppen, typ v om te vertalen.");
            input = scanner.nextLine();

            if(input.equals("x")) {
                play = false;
                System.out.println("Je hebt gekozen te stoppen.");
                break;
            }
            else if(input.equals("v")) {
                play = true;
                System.out.println("Typ een getal in van 0 t/m 9.");
                number = scanner.nextInt();
                scanner.nextLine();
                if(number < 10) {
                    String result = translatorz.translate(number);
                    System.out.println("De vertaling van " + number + " is " + result);
                }
                else {
                    System.out.println(ongeldig);
                }
            }

        }



    }
}