package tekrar;

import java.util.Scanner;

public class StringManipulation6 {
    public static void main(String[] args) {
        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen adinizi soyadinizi giriniz.\nisim");

        String isim=scan.next();
        System.out.println("soyisim");
        String soyisim=scan.next();

        if (isim.length()>soyisim.length()){
            System.out.println("isim soyisimden uzundur.");
        }else if(isim.length()==soyisim.length()){
            System.out.println("isim soyisim ile eşit uzunlukta.");
        }else System.out.println("soyisim isimden uzundur.");
    }
}
