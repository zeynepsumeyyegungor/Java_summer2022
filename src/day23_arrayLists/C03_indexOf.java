package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {
        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        System.out.println(urunler);
        System.out.println(urunler.indexOf("Ikram"));  //1 (listedeki yerini verir)
        System.out.println(urunler);
        /*
        indexOf method'u bize bilgi donduren bir methoddur,
        listemizi degistirmez.
         */

        System.out.println(urunler.lastIndexOf("Ikram")); //1

        /*
        indexOf method'u urunu aramaya 0. index'ten,
        lastIndexOf öethod'u ise aramaya son index'ten baslar.

        arama bitip,urun bulundugunda
        ikisi de bulunan urunun index'ini verir.
                 */

        urunler.add("Ikram");
        System.out.println(urunler); //[Nutella, Ikram, Cekirdek, Cay, Ikram]
        System.out.println(urunler.indexOf("Ikram"));  //1
        System.out.println(urunler.lastIndexOf("Ikram"));  //4


        System.out.println(urunler.indexOf("Hobby"));
        System.out.println(urunler.lastIndexOf("Hobby"));

    }
}
