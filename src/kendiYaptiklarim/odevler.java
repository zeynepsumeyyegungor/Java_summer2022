package kendiYaptiklarim;

import java.util.Scanner;

public class odevler {
    public static void main(String[] args) {

        /* Kullaniciya kac sayi toplamak istedigini sorun.
        Kullanici 2,3 veya 4 degerini girerse,kullanicidan bu sayilari girmesini isteyin ve
        sayilarin toplamini yazdirin.
        Kullanici toplamak istedigi sayi adedini 4’den buyuk girerse “Cok sayi girdiniz, ben toplayamam” yazdirin.
         */

        int sayiAdet = sec();
        sayiGirVeYaz(sayiAdet);
    }
    public static void sayiGirVeYaz(int sayiAdet) {
        int sayi1 = 0, sayi2 = 0, sayi3 = 0, sayi4 = 0;
        Scanner scan = new Scanner(System.in);
        if (sayiAdet < 2) {
            System.out.println("Lutfen 2 sayi ile 4 arasi bir sayi giriniz :");
        } else if (sayiAdet > 4) {
            System.out.println("Cok sayi girdiniz toplayamam.");
        } else {
            switch (sayiAdet) {
                case 4:
                    System.out.println("Lutfen sayiyi giriniz :");
                    sayi4 = scan.nextInt();
                case 3:
                    System.out.println("Lutfen sayiyi giriniz :");
                    sayi3 = scan.nextInt();
                case 2:
                    System.out.println("Lutfen sayiyi giriniz :");
                    sayi2 = scan.nextInt();
                    System.out.println("Lutfen sayiyı giriniz :");
                    sayi1 = scan.nextInt();
                    break;
            }
            System.out.println("Toplam =" + (sayi1 + sayi2 + sayi3 + sayi4));
        }
    }
    public static int sec() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kac sayi toplamak istediginizi giriniz :");


        return scan.nextInt();


    }
}