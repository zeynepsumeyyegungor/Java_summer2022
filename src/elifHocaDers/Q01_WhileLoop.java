package elifHocaDers;

import java.util.Scanner;

public class Q01_WhileLoop {
    public static void main(String[] args) {
        // girilen sayinin basamaklarindaki rakamlarin toplamini bulunuz.


        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();

        System.out.println(basamakToplama(sayi));

        basamakToplama(sayi);
    }

    public static int basamakToplama(int sayi) {
        int toplam =0;
        while (sayi!=0){
            toplam += sayi%10;
            sayi/=10;
        }


        return toplam;
    }
}
