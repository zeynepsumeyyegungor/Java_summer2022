package replit;

import java.util.Scanner;

public class Q10_Scanner04 {
    public static void main(String[] args) {
        /*
        Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
        Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.
         1 şeker = 1.7 gr
         Örnek Çıktı:
         Yılda 12.41 kg şeker kullanıyor.
         */


        double caySekeri=34;

        double yillikSekeri = ((caySekeri * 365)/1000);
        System.out.println("Yılda "+yillikSekeri+" kg şeker kullanıyor.");
    }
}
