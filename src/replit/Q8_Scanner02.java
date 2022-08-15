package replit;

import java.util.Scanner;

public class Q8_Scanner02 {
    public static void main(String[] args) {
        //Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.
        // Ornek Cikti :
        // Alan: 9
        // Cevre: 12

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen karenin bir kenarının uzunlugunu girin : ");
        int kenar=scan.nextInt();

        int alanHesapla = (kenar * kenar);
        int cevreHesapla = (4 * kenar);

        System.out.println("Alan: "+alanHesapla);
        System.out.println("Cevre: "+cevreHesapla);

    }
}
