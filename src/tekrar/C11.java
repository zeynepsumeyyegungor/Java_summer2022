package tekrar;

import java.util.Scanner;

public class C11 {
    public static void main(String[] args) {
        /*  Problem Tanımı
         Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
         a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

         Örnek Ekran Çıktısı
         a sayısını giriniz: 5
         b sayısını giriniz: 3
         c sayısını giriniz: 1
         sonuç : 5.333333333333333
         */

        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("a sayisini giriniz : ");
        a = scanner.nextDouble();

        System.out.println("b sayisini giriniz : ");
        b= scanner.nextDouble();

        System.out.println("c sayisini giriniz : ");
        c= scanner.nextDouble();

        double sonuc = ((a*a)-(b*b)) / (c*3);
        System.out.println("sonuc = " + sonuc);

    }
}
