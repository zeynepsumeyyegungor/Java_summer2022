package zeyneb;

import java.util.Scanner;

public class Deneme5 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir tamsayi isteyin ve bu tamsayının tek veya çift
        olduğunu yazdırın
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi girin");

        int sayi = scan.nextInt();

        if (sayi%2==0) {
            System.out.println("girilen sayi cifttir");

        }
        else {
            System.out.println("girilen sayi tektir");
        }
    }
}
