package replit;

import java.util.Scanner;

public class Q9_Scanner03 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve
        dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.
         Örnek Çıktı:
         Alan: 32
         Çevre: 24
         */

      int kenar1=8;
      int kenar2=4;

      int alan = (kenar1 * kenar2);
      System.out.println("Alan: "+alan);

      int cevre = (2 * (kenar1 + kenar2));
      System.out.println("Çevre: "+cevre);
    }
}
