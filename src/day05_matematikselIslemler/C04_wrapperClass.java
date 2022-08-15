package day05_matematikselIslemler;

public class C04_wrapperClass {
    public static void main(String[] args) {

        String str="Java Cok Guzel";
        str.toUpperCase();

        int sayi=10;
        // primitive data turlerinin yaninda metod'lar olmaz
        // Java bazi metod'lari kullanabilmemiz icin
        // her bir primitive data turu icin bir wrapper class olusturmustur

        Integer sayi2=10;

        sayi2.byteValue();

    }
}
