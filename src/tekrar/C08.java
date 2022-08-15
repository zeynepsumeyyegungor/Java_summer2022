package tekrar;

import java.util.Scanner;

public class C08 {
    public static void main(String[] args) {
        /*
        Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yol mesafenizi (km) girin : ");
        double yol = scan.nextDouble();

        System.out.println("Ortalama hiziniz (km/sa) : ");
        double ortHiz = scan.nextDouble();

        double varisSuresi = yol/ortHiz;
        System.out.println("varis suresi " + varisSuresi);
        scan.close();
        }
    }

