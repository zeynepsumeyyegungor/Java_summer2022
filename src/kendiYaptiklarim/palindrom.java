package kendiYaptiklarim;

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {

    /*
        Interview Question Kullanicidan bir String isteyin. Kullanicinin girdigi String'in
        palindrome olup olmadigini kontrol eden bir program yazin.
         */

    Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime veya cumle giriniz = ");
        String kelime = scan.nextLine();
        String tersKelime =kelime.substring(kelime.length()-1);

        for (int i=kelime.length()-2; i >=0 ; i--) {
            tersKelime+=kelime.substring(i,i+1);
        }
        if (kelime.equalsIgnoreCase(tersKelime)){
            System.out.println("Bu girdiginiz kelime polindrome'dur.");
        }else {
            System.out.println("Girdiginiz kelime polindrome degildir.");

        }
        System.out.println("ters kelime =" + tersKelime);




    }
}
