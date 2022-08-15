package day44_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_ListItertor {
    public static void main(String[] args) {
        //Soru 4) Bir listedeki elementleri iterator
        // kullanarak sondan basa dogru yazdirin

        List<Integer> liste =new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);

        //sondan basa gelebilmek icin
        //once sona gitmek lazim

        ListIterator lie1=liste.listIterator();
        System.out.println(liste);

        while (lie1.hasNext()){
            lie1.next();
        }
        //bu loop bizi sona goturur

        while (lie1.hasPrevious()){
            System.out.print(lie1.previous()+ " ");
        }

    }
}
