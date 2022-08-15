package day13_methodCreation;

import java.util.Scanner;

public class C02_StringManipilation {
    public static void main(String[] args) {
        /*
         Kullanicidan bir sifre girmesini isteyin.
        Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz : ");
        String sifre = scan.nextLine();
        int kontrol = 0;

        if (sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z') {
            kontrol++;
        } else {
            System.out.println("ilk harf buyuk harf olmali.");
        }
        if (sifre.charAt(sifre.length() - 1) >= 'a' && sifre.charAt(sifre.length() - 1) <= 'z') {
            kontrol++;
        } else {
            System.out.println("Son harf kucuk olmali.");
        }
        //bosluk kontrolu
        if (sifre.contains(" ")) {
            System.out.println("Sifre bosluk icermemeli.");
        } else {
            kontrol++;

            //sifre uzunluk kontrolu
            if (sifre.length() >= 8) {
                kontrol++;
            } else {
                System.out.println("Sifre en az 8 karakterli olmali.");
            }
            if (kontrol == 4) {
                System.out.println("Sifre basari ile tanimlandi");
            } else {
                System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");


            }
        }
    }
}
