package kendiYaptiklarim;

import java.util.ArrayList;
import java.util.List;

public class ArrOdevler3 {
    public static void main(String[] args) {
        /*
        3) set() methodu kullanarak, E'yi D yapiniz.
ArrayList'i ekrana yazdiriniz, list goyle olmali; A, L, C, D, F, B.
         */

        List<String> harfler =new ArrayList<>();
        harfler.add("A");
        harfler.add("L");
        harfler.add("C");
        harfler.add("E");
        harfler.add("F");
        harfler.add("B");

        List<Character> eskşHarfler=new ArrayList<>();

        char yeniHarf='D';
        char silinecekHarf='E';

        int temp =harfler.indexOf(silinecekHarf);




    }
}
