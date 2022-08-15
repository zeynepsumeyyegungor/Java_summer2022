package kendiYaptiklarim;

import java.util.Scanner;

public class odev4 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi alin,bu sayinin tek mi cift mi oldugunu,
        sifirdan buyuk mu kucuk mu oldugunu,
        ayrica ve 100’den buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
        100’den kucukse sadece 1’ler basamagini yazdiran 3 method olusturun.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz : ");
        int sayi =scan.nextInt();

        tekMiCiftMi(sayi);
        sifirdanBuyukMuKucukMu(sayi);
        yuzdenBuyukMuKucukMu(sayi);




    }



    public static void sifirdanBuyukMuKucukMu(int sayi) {
        if (sayi>=0){
            System.out.println("Girdiginiz "+sayi+" sayisi 0'dan buyuk.");
        }else {
            System.out.println("Girdiginiz " + sayi + " sayisi 0'dan kucuk.");
        }
    }

    public static void tekMiCiftMi(int sayi) {
        if (sayi%2==0){
            System.out.println("Girdiginiz "+ sayi +" sayisi cifttir.");
        }else {
            System.out.println("Girdiginiz "+ sayi +" sayisi tektir.");
    }
    }
    public static void yuzdenBuyukMuKucukMu(int sayi){
        double birlerBas=0;
        double onlarBas=0;
        double yuzlerBas=0;
        double rakamlarToplami=0;

        if (sayi>100){
            birlerBas = sayi%10;
            onlarBas = (sayi%100)/10;
            yuzlerBas = (sayi%1000)/100;
            rakamlarToplami = (birlerBas+onlarBas+yuzlerBas);
            System.out.println("Girdiginiz "+sayi+" sayisinin rakamlar toplami = "+rakamlarToplami);
        }else
        {
            System.out.println("Girdiginiz "+sayi+" sayisinin birler basamagi = " +sayi%10);
        }

}
}
