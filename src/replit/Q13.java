package replit;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan üç basamaklı bir sayı girmesini ve
        bu sayının basamaklarının toplamını bulmasını isteyin.
        Örnek Çıktı:
        Verilen tamsayının rakamları toplamı 10'dur.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("num1 = ");
        int num1 = scan.nextInt();

        System.out.println("num2 = ");
        int num2 = scan.nextInt();

        System.out.println("num3 = ");
        int num3 = scan.nextInt();

        System.out.print("Sayilarin Toplami = " +(num1+num2+num3));
    }
}
