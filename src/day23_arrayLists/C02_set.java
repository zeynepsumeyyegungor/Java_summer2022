package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    public static void main(String[] args) {
        /*
        elimizde urunlerin bulundugu bir liste var
        urun listesindeki istenen siradaki urunu
        istedigimiz yeni urun ile degistirip
        eski urunu var olan eski urunler listesine ekleyelim
         */


        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        List<String> eskiUrunler = new ArrayList<>();
        // listedeki ikram'ın yerine biskrem koyup,
        //ikram'ı da eski urunler listesine ekleyelim

        String yeniUrun ="Biskrem";
        String silinecekUrun ="Ikram";

        int temp =urunler.indexOf(silinecekUrun);
        String silinenUrun=urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("Urunler Listesi = " + urunler);
        System.out.println("Eski Urunler Listesi = " + eskiUrunler);



        yeniUrun ="Kahve";
        silinecekUrun ="Cay";

        temp =urunler.indexOf(silinecekUrun);
        silinenUrun=urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("Urunler Listesi = " + urunler);
        System.out.println("Eski Urunler Listesi = " + eskiUrunler);

    }
}
