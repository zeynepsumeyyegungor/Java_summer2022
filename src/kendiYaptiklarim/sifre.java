package kendiYaptiklarim;

import java.util.Scanner;

public class sifre {
    public static void main(String[] args) {
        /*Kullanicidan bir sifre girmesini isteyin.
         Asagidaki sartlari sagliyorsa "Sifre basari ile tanimlandi",
         sartlari saglamazsa "Islem basarisiz,Lutfen yeni bir sifre girin" yazdirin
         ve basarili sifre girincee kadar tekrar sifre girmesini isteyin
            - Sifre buyuk harf icermelidir
            - Sifre kucuk harf icermelidir
            - Sifre ozel karakter icermelidir
            - Sifre uzunlugu en az 8 karakter olmali*/

        Scanner scan = new Scanner(System.in);
        String sifre = " ";
        int sayac = 0;


        while (sayac != 4) {
            System.out.println("Lutfen sifre girin :");
            sifre = scan.nextLine();

            int kontrol = 0;
            int kontrola = 0;
            int kontrolb = 0;
            int i = 0;


            do {
                if (sifre.charAt(i) >= 'a' && sifre.charAt(i) <= 'z') {

                    kontrol++;
                }
                if (sifre.charAt(i) >= 'A' && sifre.charAt(i) <= 'Z') {
                    kontrola++;
                }
                if (!(sifre.charAt(i) >= 'A' && sifre.charAt(i) <= 'Z' || sifre.charAt(i) >= 'a' && sifre.charAt(i) <= 'z' ||
                        sifre.charAt(i) >= '0' && sifre.charAt(i) <= '9')) {
                    kontrolb++;
                }

            } while (i < sifre.length());

            if (kontrol == 0) {
                System.out.println("Sifre kucuk harf icermelidir.");
            } else {
                sayac++;
            }
            if (kontrola == 0) {
                System.out.println("Sifre buyuk harf icermelidir.");
            } else {
                sayac++;
            }
            if (kontrolb == 0) {
                System.out.println("Sifre ozel karakter icermelidir");
            } else {
                sayac++;
            }
        }
    }
}