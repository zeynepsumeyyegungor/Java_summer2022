package replit;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        /*
        Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.
                Input :
                John White
                1234234534561478
                Output :
                Name :
                J*** W****
                CCN : **** **** **** 1478
                Ilk Harfler Buyuk harf ile baslamalidir.
         */

        String name= "John";
        String surname = "White";
        String cardnumber="1234234534561478";

        String nameLatter = name.substring(0,1).toUpperCase();
        String nameEnd = name.substring(1).replaceAll("\\w","*");

        String surnameLatter = surname.substring(0,1).toUpperCase();
        String surnameEnd = surname.substring(1).replaceAll("\\w","*");

        String cardFirst = "**** **** ****";
        String card4 = cardnumber.substring(12,16);

        System.out.println(nameLatter+nameEnd+" "+surnameLatter+surnameEnd);
        System.out.println("CCN : "+ cardFirst+card4);

    }
}
