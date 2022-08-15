package day18_While_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        /*
        Kullanicidan tam sayilar alin,
        kullanici cift sayi girdigi muddetce sayilari yazdirin
        tek sayi girdiginde islemi bitirin.
         */

        //while ile;

        Scanner scan =new Scanner(System.in);
        int sayi = 0;

        //while ile yapalim;
        /*
        Loop'larda kullanacagimiz variabşe'lari loop'tan once olusturmaliyiz
        while loop'ta, loop'tan once olusturdugumuz bu variable'a
        atayacagimiz degeri iyi dusunmemiz gerekir.
         */

        while (sayi%2==0){
            System.out.println("Lutfen bir sayi giriniz = ");
            sayi = scan.nextInt();
            if (sayi%2==0){
                System.out.println("Girilen sayi cifttir = " + sayi);
            }else {
                System.out.println("Girilen sayi tektir,benden de bu kadar...");
            }
        }


        // do-while loop ile yapalim ;
        // do-while loop'ta onceden olusturulan variable'a hangi deger atandiginin hicbir onemi yok
        // kodumuz her durumda calisir

        /*do-while'ın dezavantajı ;
        ilk calistirma kontrol yapilmadan oldugu icin
        loop'un body'sinde yanlis bir islem yapilmamasina dikkat etmek gerekir
         */


        do{
            System.out.println("Lutfen bir sayi giriniz = ");
            sayi = scan.nextInt();
            if (sayi%2==0){
                System.out.println("Girilen sayi cifttir = " + sayi);
            }else {
                System.out.println("Girilen sayi tektir,benden de bu kadar...");
            }


        }while (sayi%2==0);
    }
}
