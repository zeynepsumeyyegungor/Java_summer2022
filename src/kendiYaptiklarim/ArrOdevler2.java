package kendiYaptiklarim;

import java.util.ArrayList;
import java.util.List;

public class ArrOdevler2 {
    public static void main(String[] args) {
      /*
       2) indexsiz add() methodunu kullanarak, B'yi ekleyiniz.
      index'li add() methodunu kullanarak, L'yi 1 numarali index'e ekleyiniz.
      ArrayList'i ekrana yazdiriniz, list goyle olmali; A, L, C, E, F, B.
         */

        List<String> harfler =new ArrayList<>();
        harfler.add("A");
        harfler.add("C");
        harfler.add("E");
        harfler.add("F");
        System.out.println(harfler);

        harfler.add("B");
        System.out.println("son hali " + harfler);

        harfler.add(1,"L");
        System.out.println(harfler);
    }
}
