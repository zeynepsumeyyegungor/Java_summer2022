package kendiYaptiklarim;

import java.util.ArrayList;
import java.util.List;

public class ArrOdevler4 {
    public static void main(String[] args) {
        /*
       4.  ) remove() methodu kullanarak, F'yi siliniz.
ArrayList'i ekrana yazdiriniz, list goyle olmali; A, L, C, D, B.
         */

        List<String> harfler =new ArrayList<>();
        harfler.add("A");
        harfler.add("L");
        harfler.add("C");
        harfler.add("E");
        harfler.add("F");
        harfler.add("B");

        System.out.println(harfler.remove(4));
        System.out.println(harfler);
    }
}
