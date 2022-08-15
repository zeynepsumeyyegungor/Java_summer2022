package tekrar;

import java.util.Locale;
import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
        //kullanicidan isim ve soyisimini girmesini isteyin
        //sonrasinda konsola tam ismini buyuk harfler ile yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adinizi ve soyadinizi giriniz  :");
        String firsName = scan.nextLine(),
                lastName = scan.nextLine();  //multiple declaration
        
        String fullName = firsName.concat(" " + lastName).toUpperCase();
        System.out.println("fullName = " + fullName);
    }
}
