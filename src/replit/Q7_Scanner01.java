package replit;

import java.util.Scanner;

public class Q7_Scanner01 {
    public static void main(String[] args) {
        //Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz : ");
        double sayi = scan.nextDouble();

        double sayininKüpü = ((sayi * sayi * sayi) / 2);
        System.out.println("sayininKüpününYarisi = " + sayininKüpü);
    }
}
