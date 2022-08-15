package zeyneb;

import java.util.Scanner;

public class Marketsorusu {
    public static void main(String[] args) {
        /*
        Bir kişi mağazadan 100 TL ve üzeri alışveriş yaparsa %10 indirim,
        200 TL ve üzeri alışveriş yaparsa %15 indirim,
        300 TL ve üzeri alışveriş yaparsa %20 indirim kazandığını
        ve ödeyeceği miktarı ekrana yazan C # kodlarını yazınız. */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen fiyatı girin;");

        double fiyat=scan.nextDouble();
        if (fiyat>100 && fiyat<200){
            System.out.println ("ödeyeceğiniz fiyat: " + (fiyat-(fiyat*10/100)));
        } else if (fiyat>200 && fiyat <300){
            System.out.println ("ödeyeceğiniz fiyat: " + (fiyat-(fiyat*15/100)));
        }else if (fiyat>=300){
            System.out.println("ödeyeceginiz fiyat: " + (fiyat-(fiyat*20/100)));
        }

    }
}
