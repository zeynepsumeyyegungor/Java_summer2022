package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {
        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        /*
        remove method'u 2 dekilde kullanilir
        1- objeyi yazip silmesini istersek bize boolean sonuc doner true/false
        2- index girersek o index'teki siler ve bize silinen elemani dondurur
         */

        System.out.println(urunler);  //[Nutella, Ikram, Cekirdek, Cay]
        System.out.println(urunler.remove("Ikram"));  //true
        System.out.println(urunler);  //[Nutella, Cekirdek, Cay]


        //2. yontemi deneyelim


        System.out.println(urunler.remove(1));  //Cekirdek
        System.out.println(urunler);  //[Nutella, Cay]

        //olmayan bir urunu silmek istersek
        // System.out.println(urunler.remove(3));
        // IndexOutOfBoundsException   -> hatası verir
    }
}
