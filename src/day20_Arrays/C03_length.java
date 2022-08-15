package day20_Arrays;

import java.util.Arrays;

public class C03_length {
    public static void main(String[] args) {
        //iki sekilde array olusturabilirz

        int sayilar[]={1,2,3};

        String harfler[]=new String[4];

        System.out.println("Sayilar array'in uzunlugu : " +sayilar.length); //3

        //String length() method'unda parantez var,array'de yok.

        System.out.println("Harfler method'un uzunlugu : " +harfler.length); //4
        System.out.println(Arrays.toString(harfler)); //null null null null

        // harfler array'inin son elementini yazdiralim
        System.out.println(harfler[harfler.length-1]);


        System.out.println(harfler[5]); //ArrayIndexOutOfBoundsException
    }
}
