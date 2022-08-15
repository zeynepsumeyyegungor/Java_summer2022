package zeyneb;

import java.util.Scanner;

public class DenemeOkulaBaslama {
    public static void main(String[] args) {
        /* kullanicidan ogrencinin yasini isteyin:
        eger 7 yasinda ise "Okula Baslayabilir",
        7'den kucukse "..... yil sonra baslayabilir",
        7'den buyukse ".... yil gecikmissiniz" yazdirin...
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Ogrencinin dogum yilini girin :");
        int dogumYili=scan.nextInt();
        int yas=2022-dogumYili;;

        if (yas==7){
            System.out.println("Okula Baslayabilir.");
        }else if (yas<7){
            System.out.println((7-yas) + "yil sonra okula baslayabilir." );
        }else if (yas>7){
            System.out.println((yas-7) + "yil gecikmissiniz." );
        }
    }
}
