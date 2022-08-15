package kendiYaptiklarim;

import java.util.Scanner;

public class odev2 {
    public static void main(String[] args) {
        /*
        Kullaniciya kac sayi toplamak istedigini sorun kullanici 2,3 veya 4 degerini girerse,
        kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdirin.
        kullanici toplamak istedigi sayi adedini 4'den buyuk girerse "cok sayi girdiniz,ben toplayamam" yazdirin
         */
        int sayi=0;


        maxDortSayiToplarim(sayi);


    }

    public static void maxDortSayiToplarim(int sayi) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Kac sayi toplamak istiyosunuz (2, 3 ve 4 tane sayi toplayabilirsiniz");
        int kacSayi=scan.nextInt();

        if (kacSayi<=1 && kacSayi>=5){
            System.out.println("Cok sayi girdiniz, ben toplayamam");
        }else if (kacSayi==2){
            System.out.println("Birinci sayiyi giriniz");
            int s1=scan.nextInt();
            System.out.println("Ikinci sayiyi giriniz");
            int s2=scan.nextInt();
            System.out.println("Iki sayinin toplami :" +(s1+s2));
        } else if (kacSayi==3) {
            System.out.println("Birinci sayiyi giriniz");
            int s1=scan.nextInt();
            System.out.println("Ikinci sayiyi giriniz");
            int s2=scan.nextInt();
            System.out.println("Ucuncu sayiyi giriniz");
            int s3=scan.nextInt();
            System.out.println("Uc sayinin toplami :" +(s3+s2+s1));
        } else if (kacSayi==4) {
            System.out.println("Birinci sayiyi giriniz");
            int s1=scan.nextInt();
            System.out.println("Ikinci sayiyi giriniz");
            int s2=scan.nextInt();
            System.out.println("Ucuncu sayiyi giriniz");
            int s3=scan.nextInt();
            System.out.println("Dorduncu sayiyi giriniz");
            int s4=scan.nextInt();
            System.out.println("Dort sayinin toplami :" +(s4+s2+s3+s1));
        }
    }
}

