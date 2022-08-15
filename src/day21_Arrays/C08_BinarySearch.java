package day21_Arrays;

import java.util.Arrays;

public class C08_BinarySearch {
    public static void main(String[] args) {
        /*
        Binary Search Java'da eleman aramanin kisa yoludur
        ancak binary searc'in calismasi icin önce array'in
        sirali hale gelmesi gerekir.
        Eger siralama yapmadan BinarySearch yaparsaniz
        sonucu bulamaybilir veya yanlis bulabilir
         */

        String[] harfler ={"Y", "B", "D", "G", "O", "A"};

        String arananHarf="A";

        System.out.println(Arrays.binarySearch(harfler,arananHarf));
        System.out.println(C03_Contains.contains(harfler,arananHarf));
        // BinarySearch bize aradigimiz elemanin indexini dondurur.
        //Array sirali olmadigi icin arama sonucunu dogru bulamayabilir,
        //emin olmak icin once sort yapmamiz lazim

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler,arananHarf));
    }
}
