package day14_methodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {
        /*
        Eger bir class'in icerisinde herhangi bir hesaplama yapip
        bunu da saklamak istersek
        kodumuzu sade ve anlasilir tutmak icin
        islemi bir method'da yapip
        sonucunu main method'a dondurebiliriz
        Return type'i void olmayan bir method'un sonucunu
        main method'da bir variable'a atama yaparsak
        programin geri kalaninda bu degeri kullanma sansimiz olur
         */


        //Kullanicidan sehir ismini ve dogum tarihini alip
        //bunlari programda kullancagimi formatta bize donduren bir method olusturun
        //Sehir ismini programimiza büyük harf olarak,
        //Tarihi ise 2022-06-30 seklinde kullanmak istiyoruz

        String sehir =sehirAl();
        String tarih =tarihAl();

        System.out.println("Girdiginiz sehir :" + sehir);
        System.out.println("Girdiginiz tarih :" + tarih);
    }

    public static String tarihAl() {
        String tarih = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Yil giriniz :");
        int yil =scan.nextInt();
        if (yil>1900 && yil<2100){
            tarih =yil+"-";
        }else {
            System.out.println("Yil icin gecerli tarih girmelisin (1900-2000)");
        }
        System.out.println("Kacinci ay oldugunu tam sayi olarak yaziniz : ");
        int ay = scan.nextInt();

        if (ay<=0 || ay>12){
        System.out.println("Ay no 1-12 arasında olmalidir.");
        }else if (ay<10){
            tarih=tarih+"0"+ay+"-";
        }else {
            tarih=tarih+ay+"-";
        }
        System.out.println("Lutfen ayin kacinci gunu oldugunu tam sayi olarak giriniz :");
        int gun = scan.nextInt();
        if (gun<=0 || gun>31){
            System.out.println("Gun no olarak 1-31 arasi sayi eklenmelidir");
        }else if (gun<10){
            tarih=tarih+"0"+gun;
        }else {
            tarih=tarih+gun;
        }
        return tarih;

    }

    public static String sehirAl() {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen sehir adi giriniz :");
        String sehirAdi=scan.next().toUpperCase();

        return sehirAdi;

    }
}
