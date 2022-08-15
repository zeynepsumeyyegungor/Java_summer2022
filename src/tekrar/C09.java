package tekrar;

import java.util.Scanner;

public class C09 {
    public static void main(String[] args) {
        /*
         Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		              Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kg olarak kilonuzu girin :");
        double kilo = scanner.nextDouble();

        System.out.println("Cm olarak boyunuzu girin :");
        double boy = scanner.nextDouble();
        boy = boy/100;   // boy/=100 aynısı demektir.
        double vke =kilo/(boy*boy);
        System.out.println("Vucut Kitle Endeksiniz : " + vke);
    }
}
