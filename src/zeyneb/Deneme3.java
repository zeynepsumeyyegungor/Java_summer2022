package zeyneb;

import java.util.Scanner;

public class Deneme3 {
    public static void main(String[] args) {

        /*
        kullanıcıdan dikdörtgenin kenar uzunluklarını isteyin
        dikdörtgenin kare olup olmadığını yazdırın
         */
        Scanner scan = new Scanner((System.in));
        System.out.println("Lutfen kenar uzunluk giriniz");

        int kenar= scan.nextInt();
        int kenar2= scan.nextInt();

        if (kenar==kenar2) {
            System.out.println("bu bir karedir");

        }
        else if (!(kenar==kenar2)) {
            System.out.println("bu bir dikdörtgendir");
        }
    }

}
