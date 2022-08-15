package zeyneb;

import java.util.Locale;
import java.util.Scanner;

public class Deneme02 {
    public static void main(String[] args) {

        /*
        soru 5) Kullanicidan bir gun alin eğer gun
        “Cuma” ise ekrana “Muslumanlar için kutsal gun” yazdirin.
        "Cumartesi" ise ekrana “Yahudiler için kutsal gun” yazdirin.
        “Pazar” ise ekrana “Hiristiyanlar için kutsal gun” yazdirin
         */

        Scanner scan = new Scanner((System.in));
        System.out.println("Lutfen gun giriniz");

        String gun = scan.next().toLowerCase();
        if (gun.equals("cuma")) {
            System.out.println("Muslumanlar icin kutsal gun");
        } else if (gun.equals("cumartesi")) {
            System.out.println("Yahudiler icin kutsal gun");
        } else if (gun.equals("pazar")) {
            System.out.println("Hristiyanlar icin kutsal gun");
        }

    }
}
