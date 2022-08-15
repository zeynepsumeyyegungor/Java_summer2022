package tekrar;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
        //  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve
        //  son 2 basamagindaki rakamlari toplamini bulunuz
        // ex:
        // input : 12345
        // out : 12

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli rakam girin : ");
        int num = scan.nextInt();

        int ilkIki=num/1000;
        int sonIki=num%100;  //100'e bölümünden kalanını verir

        int ilkIkiToplam = (ilkIki/10) + (ilkIki%10);
        System.out.println("ilkIkiToplam = " + ilkIkiToplam);
        int sonIkiToplam = (sonIki/10) + (sonIki%10);
        System.out.println("sonIkiToplam = " + sonIkiToplam);

        System.out.println("sayıların toplamı : " +(ilkIkiToplam+sonIkiToplam));



    }
}
