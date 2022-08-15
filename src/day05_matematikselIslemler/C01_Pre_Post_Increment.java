package day05_matematikselIslemler;

public class C01_Pre_Post_Increment {
    public static void main(String[] args) {

        int sayi1= 10;
        int sayi2=sayi1+1 ; // sayi2--> 11
        sayi2 +=5; //  sayi2--> 16
        /*
        pre veya post increment/decrement
        sadece ++ ve -- islemi icin gecerlidir
        bu iki islem sayidan sonra veya once yazilmasina gore farkli iki isleyis olur
         */
        int sayi3 = sayi2++; // 1- sayi2 1 artirilacak
                             // 2- sayi2 degeri sayi3'e atanacak


        int sayi4=++sayi1; // 1- sayi2 1 artirilacak
                           // 2- sayi2 degeri sayi4'e atanacak
        System.out.println("sayi3 : " + sayi3);
        System.out.println("sayi2 : " + sayi2);


        System.out.println("sayi4 : " + sayi4);
        System.out.println("sayi1 : " + sayi1);


    }
}
