package day06_concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {

        /*
        Wrapper Class Java'nın hazir metodlaai kullanabilmemiz icin
        primitive data turlerinin herbiri icin actigi class'lardir


         */
        String str= "Java ile hayat ne guzel";

        System.out.println(str.toUpperCase());  //JAVA İLE HAYAT NE GUZEL

        boolean guzelMi =true ;
        //guzelMi;   boolean primitive oldugundan hazir method2u bulunmuyor

        Boolean buGuzelMi=true;
        buGuzelMi.toString();

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        String ogrNo="123456";


        // kullanicidan bir sifre isteyin
        // eger sifre sadece rakamlardan olusuyorsa kabul etmeyelim

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sifre giriniz");

        String sifre=scan.nextLine();

        Integer sifreSayi= Integer.parseInt(sifre);


        System.out.println("girilen sifrenin 3 fazlasi : " + (sifre+3));
        System.out.println("Integer sifrenin 3 fazlasi : " + (sifreSayi+3));

        /*
        Wrapper Class'lar ilerde kullanacagimiz pekcok faydali hazir methodlar icerir
         */



    }
}
