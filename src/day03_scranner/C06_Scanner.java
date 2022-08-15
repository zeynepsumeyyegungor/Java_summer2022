package day03_scranner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        /*
        kullanicidan ismini soyismini ve yasini alip
        girilen bilgiler = seyfi capar 34 seklinde yazdirin
         */

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        /*
        string verileri scanner ile alirken
        next() : ilk bosluga kadar olan kismi(1 kelime) alir,
        nextLine() : satirin sonuna kadar ne yazarsak alir
        NOT : eger ardarda birden fazla String deger deger alacaksak nextLine() kullanmaliyiz
         */

        String isim=scan.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");

        String soyiIsim = scan.next();

        System.out.println("Lutfen yasinizi giriniz");

        double yas= scan.nextDouble();
        // girilen bilgiler seyfi sapar 34 seklinde yazdirin

        System.out.println("girilen bilgiler = " + isim +" " + soyiIsim +" "+ yas );



    }
}
