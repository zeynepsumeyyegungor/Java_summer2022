package tekrar;

import java.util.Scanner;

public class C14 {
    public static void main(String[] args) {
        /*
         Problem tanimi :
         Kullanicidan  yasini ve kilosunu alaliniz
         18 yasindan kucuk ise kan bagisi yapamaz
         18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
         18 yasindan buyuk ve 50 kiloysaniz ve daha agir ise kan bagisi yapabilir.
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Kac yasindasiniz ? :");
        int yas = scan.nextInt();

        System.out.println("Kilonuzu giriniz : ");
        int kilo = scan.nextInt();

        if (yas<18){
            System.out.println("Yasi 18'den kucuk olanlar kan bagisi yapamaz.");
        }else if (yas>=18){
            if (kilo>0 && kilo<50){
                System.out.println("Kilonuz 50 kg'den kucuk oldugu icin kan bagisi yapamazsiniz.");
            }
        else {
            System.out.println("Kan bagisi yapabilirsiniz");
        }
    }}
}
