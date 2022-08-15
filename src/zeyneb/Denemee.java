package zeyneb;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Denemee {
    public static void main(String[] args) {
        /* Kullanicidan bir yil girmesini isteyin:
        1945 ve öncesine : "Gelenekci ve sessiz nesil",
        1946 - 1964 doğumlu : "Baby Boomers",
        1965 - 1976 doğumlu : "X Kusagi",
        1977 - 1995 doğumlu : "Y Kusagi",
        1996 - 2015 doğumlu : "Z Kusagi",
        2016 ve sonrasina : "Alfa Kusagi" yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir yil girin : ");
        int yil = scan.nextInt();

        if (yil <= 1945) {
            System.out.println("Gelenekci ve sessiz nesil.");
        } if  (yil >= 1946 && yil <= 1964) {
            System.out.println("Baby Boomers");
        } if  (yil >= 1965 && yil <= 1976) {
            System.out.println("X Kusagi");
        } if  (yil >= 1977 && yil <= 1995) {
            System.out.println("Y Kusagi");
        } if  (yil >= 1996 && yil <= 2015) {
            System.out.println("Z Kusagi");
        } if (yil>=2016)  {
            System.out.println("Alfa Kusagi");
        }
    }
}