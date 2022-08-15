package tekrar;

import java.util.Scanner;

public class C10 {
    public static void main(String[] args) {
        /*
        Kullanicidan alacaginiz vize2 vize2 ve final notlarini
        vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */

        Scanner scan = new Scanner(System.in);

        int vize1;
        int vize2;
        int finalNot;

        System.out.println("1. Vize : ");
        vize1=scan.nextInt();

        System.out.println("2. Vize : ");
        vize2=scan.nextInt();

        System.out.println("Final Notu : ");
        finalNot=scan.nextInt();

        double sonuc =((vize1+vize2)/2*0.3) + finalNot*0.7;
        System.out.println("Sonuc : " + sonuc);
    }
}
