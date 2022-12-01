package zEnSon;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        // kullanicidan ismini isteyin
        // girilen ismi
        // isminiz : Ercan    seklinde yazdirin

        // insanlarin dunyasindan kod'larimizin bulundugu class'a deger almak icin
        // Scanner class'ini kullaniriz

        // 1- Scanner objesi olusturalim
        Scanner Scan = new Scanner(System.in);

        // 2- Kullaniciya ne istedigimizi soyleyelim
        System.out.println("Lutfen isminizi giriniz");

        // 3- olusturdugumuz scan objesi ile kullanicinin girdigi degeri alip
        // olusturacagimiz uygun bir variable'a atayalim

        String kullaniciIsmi=Scan.next();
        System.out.println("Isminiz : " + kullaniciIsmi);
    }
}
