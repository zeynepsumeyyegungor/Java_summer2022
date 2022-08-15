package day03_scranner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi,Soyisminizi ve Yaşınızı giriniz \naralarda enter tuşuna  başınız");
        String isim = scan.nextLine();
        String soyisim = scan.nextLine();
        int yas = scan.nextInt();
        System.out.println("Girilen Bilgiler = " + isim + soyisim + yas);


    }
}

