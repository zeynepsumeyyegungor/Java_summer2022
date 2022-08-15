package zeyneb;

import java.util.Scanner;

public class Deneme8 {
    public static void main(String[] args) {

        /* Kullanican bir sayi girmesini isteyin,
        girinlen sayi:
        10 ise "Iki basamakli en kucuk sayi",
        100 ise "Uc basamakli en kucuk sayi"
        1000 ise "Dort basamakli en kucuk sayi"
        Diger durumlarda "Girdigin sayiyi degistir..." yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 10-100-1000 sayilarindan birini girin");


        int sayi =scan.nextInt();

        switch (sayi){
            case 10 :
                System.out.println("Iki basamakli en kucuk sayi.");
                break;
            case 100 :
                System.out.println("Uc basamakli en kucuk sayi.");
                break;
            case 1000 :
                System.out.println("Dort basamakli en kucuk sayi.");
                break;
            default:
                System.out.println("Girdigin sayiyi degistir...");
        }
    }
}
