package day09_ternary;

import java.util.Scanner;

public class C01_ternary {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi girin");

        //Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin.
        double sayi=scan.nextDouble();

        System.out.println(sayi>=0 ? sayi : (-1*sayi));
     }
    }

