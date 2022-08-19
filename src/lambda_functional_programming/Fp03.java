package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp03 {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);
        buyukHarfleYazdir(liste);
        System.out.println();
        // buyukHarfleYazdir2(liste);
        uzunlugaGoreYazdir(liste);
        System.out.println();
        uzunlugaGoreTersYazdir(liste);
        System.out.println();
        sonKaraktereGoreTekrarsizYazdir(liste);
        System.out.println();
        uzunlukVeIlkHarfeGoreYazdir(liste);
        System.out.println();
        //bestenBuyukleriSil(liste);
        //baslangiciAYadaSonuNOlaniSil(liste);
        //baslangiciAYadaSonuNOlaniSil02(liste);
        uzunlugu8ile10arasiveOIleBiteniSil(liste);
    }

    //1) Tum elemanlari buyuk harf ile yazdiran method olusturun
    //1. YOL :
    public static void buyukHarfleYazdir(List<String> liste) {
        liste.stream().map(String::toUpperCase).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }
    //2. YOL :
    //public static void buyukHarfleYazdir2(List<String> liste){
    //    liste.replaceAll(String::toUpperCase);
    //    System.out.println(liste);
    // }

    //2) Elemanlari uzunluklarina gore siralayip yazdiran bir method olusturun

    public static void uzunlugaGoreYazdir(List<String> liste) {
        liste.
                stream().
                sorted(Comparator.comparing(String::length)).
                forEach(Utils::ayniSatirdaBosluklaYazdir); //Comparator.comparing(); siralama kosullarini belirlemek icin yazdirir
        System.out.print(liste);
    }

    //3) Elemanları uzunluklarına göre ters sıralayıp yazdıran bir method oluşturun.
    public static void uzunlugaGoreTersYazdir(List<String> liste) {
        liste.stream().sorted(Comparator.comparing(String::length).reversed()).
                forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //4) Elemanları son karakterlerine göre sıralayıp tekrarsız yazdıran bir method oluşturun.
    public static void sonKaraktereGoreTekrarsizYazdir(List<String> liste) {
        liste.stream().distinct().sorted(Comparator.comparing(Utils::sonKarakteriAl)).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }

    //5) Elemanları önce uzunluklarına göre ve sonra ilk karakterine göre sıralayıp yazdıran bir method oluşturun.
    public static void uzunlukVeIlkHarfeGoreYazdir(List<String> liste) {
        liste.
                stream().
                sorted(Comparator.comparing(String::length).thenComparing(Utils::ilkKarakteriAl)).//thenComparing() :==>siralama icin bir kosul daha belirtir
                forEach(Utils::ayniSatirdaBosluklaYazdir);
    }
    //6) Uzunlugu 5'ten buyuk olan elemanlari silen bir methot olusturun.
    // public static void bestenBuyukleriSil(List<String> liste){
    //  liste.removeIf(t->t.length()>5);
    //  System.out.println(liste);

     //7) 'A', 'a' ile başlayan yada 'N', 'n' ile biten elemanları silen bir method oluşturun.
     //1. Yol
     //    public static void baslangiciAYadaSonuNOlaniSil(List<String> list){
     //
     //        list.removeIf(t->t.charAt(0)=='A'||t.charAt(0)=='a'||t.charAt(t.length()-1)=='N'||t.charAt(t.length()-1)=='n');
     //        System.out.println(list);
     //
     //    }
         //2. Yol
     //    public static void baslangiciAYadaSonuNOlaniSil02(List<String > list){
     //
     //        list.removeIf(t->t.startsWith("A")||t.startsWith("a")||t.endsWith("N")||t.endsWith("n"));
     //        System.out.println(list);//[Mark, Christopher, Mariano, Tucker]
     //
     //    }


         //8) Uzunluğu 8 ile 10 arası olan yada 'o' ile biten elemanları silen bir method oluşturun.

    public static void uzunlugu8ile10arasiveOIleBiteniSil(List<String> liste){
        liste.removeIf(t->(t.length()>7 && t.length()<11)  ||  t.endsWith("o"));
        System.out.println(liste);
    }
}

