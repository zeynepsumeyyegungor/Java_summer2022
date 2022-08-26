package miracHoca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class benimSorum {
    public static void main(String[] args) {
        //aile fertlerinin sayisini bilmeden hanenin yas ortalamsini bul

        List<Integer> sayilar = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int yas = 1;
        do {
            System.out.println("Aile bireylerinin yasini girin,(sirayla) :");
            yas = scan.nextInt();
            if (yas != 0) {
                sayilar.add(yas);
            }
        } while (yas!=0);
        System.out.println(sayilar);
        double ortalama = 0;
        for (int sayi : sayilar) {
            ortalama += sayi;
        }
        ortalama /= sayilar.size();
        System.out.println("yaslarin ortalmasi : " + ortalama);
    }
}
