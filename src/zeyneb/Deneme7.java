package zeyneb;

import java.util.Scanner;

public class Deneme7 {
    public static void main(String[] args) {
        /* Bir öğrencinin üç sınav notuna göre
        ortalaması hesaplanarak notu 50 ve üzeri ise geçti,
         50 nin altındaysa kaldı yazan  kodları yazınız.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sınav notunu girin :");
        double not1 = scan.nextDouble();
        double not2 = scan.nextDouble();
        double not3 = scan.nextDouble();
        double ort;
        ort = ((not1 + not2 + not3) / 3);
        System.out.println(ort);

        if (ort < 50) {
            System.out.println("KALDI");
        } else System.out.println("GECTİ");
    }


}