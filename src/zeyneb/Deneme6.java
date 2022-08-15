package zeyneb;

import java.util.Scanner;

public class Deneme6 {
    public static void main(String[] args) {
         /*
        Kullanıcıdan iki sayı isteyin;
        sayıların ikisi de pozitif ise sayıların toplamını,
        ikisi de negatif ise sayıların çarpımını,
        ikisi de farklı işaretli ise 'farklı işaretlerde işlem yapamazsın'
        sayılardan sıfıra eşit olan varsa 'sıfır carpmaya göre yutan
        elemandır'yazdırın
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen iki tane sayi giriniz");
        int sayi1=scan.nextInt();
        int sayi2=scan.nextInt();

        if (sayi1>=0 && sayi2>=0){
            System.out.println("sayilarin toplami :"+ " "+ (sayi1+sayi2));

        }
        else if (sayi1<0 && sayi2<0){
            System.out.println("sayilarin carpimi:" + " " + sayi1*sayi2);
        }
        else if (sayi1<=0 && sayi2>0  || sayi1>0 && sayi2<0) {
            System.out.println("farkli isaretlerde islem yapamazsin");

        }
        else if (sayi1==0 && sayi2==0) {
            System.out.println("sifir carpmaya gore yutan elemandir");
        }
    }
}
