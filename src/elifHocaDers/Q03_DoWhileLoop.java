package elifHocaDers;

import java.util.Scanner;

public class Q03_DoWhileLoop {
    public static void main(String[] args) {
            /*
            Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
            ve x girildiğinde ise "Program bitti" yazan programı yazınız.
            */

        Scanner abc = new Scanner(System.in);
        String okunan ="";


        do {
            System.out.println("harf giriniz : ");
            okunan =abc.next();
            System.out.println("Program calisiyor.");

        }while (!okunan.equalsIgnoreCase("x"));

        System.out.println("Program Bitti.");
    }
}
