package day12_stringManipulations;

public class C03_substring {
    public static void main(String[] args) {

        String isim = "Suleyman";
        String soyisim = "Karanfil";
        String kartNo = "1234 6589 7458 9658";

        System.out.println(isim.substring(3));  //eyman
        System.out.println(soyisim.substring(soyisim.length()-3)); //fil

        System.out.println(isim.substring(2,4)); //le

        //isim ve soyismin ilk harfi buyuk harf,gerisi *
        // kredi kartın ilk 4 rakami gorunsun kalani *

        String isimIlkHarf = isim.substring(0,1).toUpperCase();
        String isimGeriyeKalanlar = isim.substring(1).replaceAll("\\w","*");

        String soyisimIlkHsrf = soyisim.substring(0,1).toUpperCase();
        String soyisimGeriyeKalanlar = soyisim.substring(1).replaceAll("\\w","*");

        String KKartiIlk4 = kartNo.substring(0,4);
        String KKartiGeriKalanlar =" **** **** ****";


        System.out.println(isimIlkHarf+isimGeriyeKalanlar+" "+
                           soyisimIlkHsrf+soyisimGeriyeKalanlar+" "+
                           KKartiIlk4+KKartiGeriKalanlar);
    }
}
