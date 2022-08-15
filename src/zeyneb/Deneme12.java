package zeyneb;

import java.util.Scanner;

public class Deneme12 {
    public static void main(String[] args) {
         /*
          Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa
            “Sifre basari ile tanimlandi”,
            sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
                - Ilk harf buyuk harf olmali
                - Son harf kucuk harf olmali
                - Sifre bosluk icermemeli
                - Sifre uzunlugu en az 8 karakter olmali
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ilk harfi buyuk,8 karakterli bir sifre giriniz : ");

        String password = scan.nextLine();

        String ilkHarf = password.substring(0,1).toUpperCase();

        String sonHarf = password.substring(password.length()-1).toLowerCase();

        String bosluk = password.replaceAll("\\s","");

        if (ilkHarf.equals(ilkHarf) && (sonHarf.equals(sonHarf) && (bosluk.equals(bosluk)&& (bosluk.length()>=8))))
        {
            System.out.println("islem basarili.");

        }  else {
                System.out.println("islem basarisiz.");
            }
    }
}