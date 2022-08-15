package ornekSorular;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class codePage {
    public static void main(String[] args) {
        girisSayfasi();
    }

    static Scanner scan = new Scanner(System.in);

    public static void girisSayfasi() {
        System.out.println("Aciklama icin 1'i,oyun icin 2'yi giriniz:");
        char giris = scan.nextLine().charAt(0);
        switch (giris) {
            case '1':
                aciklamaGetir();
                sayiUret();
                sayiKontrol();
                break;
            case '2':
                sayiUret();
                sayiKontrol();
                break;
            default:
                System.out.println("Yanlis deger girdiniz.");
        }
    }

    private static void sayiKontrol() {
        System.out.println("OYUN BASLIYOR");
        int [] girilenSayiArr = new int[4];
        int arti;
        int eksi;
        int toplamBilinen;
        int kacKeredeBuldu = 0;
        int test;
    }{
        System.out.println("Lutfen 4 basamakli rakamlari birbirinden farkli sayi giriniz");
        int girilenSayi = scan.nextInt();

 }


    public static void sayiUret() {
        int [] sayiUretAr=new int[4];
        int test=0;
        int min=1000;
        int max=9999;
        Random rnd=new Random();

       do {
           int sayi=rnd.nextInt(max-min)+min;
           for (int i = 3; i >=0 ; i--) {
               sayiUretAr[i]=sayi%10;
               sayi/=10;
           }
           for (int i = 0; i <4 ; i++) {
               for (int j = 0; j <4; j++) {
                   if (sayiUretAr[i]==sayiUretAr[j]){
                       test++;
                   }

               }

           }if (test==4){
               break;
           }else {
               test=0;
           }

       }while (test<4);
        System.out.println(Arrays.toString((sayiUretAr)));
    }

    public static void aciklamaGetir() {
        int n;
        FileInputStream fis=null;
        try{
            fis=new FileInputStream("src/ornekSorular/aciklama.txt");
            while ((n=fis.read())!=-1) {
                System.out.print((char)n);
            }
        }catch (FileNotFoundException e){
            System.out.println("Dosya bulunamadi.");
        }catch (IOException e){
            System.out.println("Dosyadan bilgiler akinamadi");
        }
        System.out.println();
    }
}
