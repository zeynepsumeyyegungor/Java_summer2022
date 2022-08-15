package day11_stringManipulations;

public class C04_contains {
    public static void main(String[] args) {


    /*Kullanicidan bir cumle isteyin:
    Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
    “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
     iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
     */

        String cumle = "Java buyuk, dunya kucuk";

        // requirements'de buyuk kucuk harf hassasiyeti ile ilgili bir şey soylenmemis.
        // ikinci olarak da her iki kelimeyi de icerme durumu aciklamamis
        // bu durumda gorevi bize kim verdiyse ona sormak lazim

        //ek requirements : ikincini de iceriyorsa "karar ver buyuk mu yazdirayim,kucuk mu ?"
        //case sensitive

       if (cumle.contains("kucuk") &&  cumle.contains("buyuk")){
           System.out.println("karar ver buyuk mu yazdirayim,kucuk mu ?");
       }
        else if (cumle.contains("buyuk")) {
            System.out.println(cumle.toUpperCase());
        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
        } else {
            System.out.println("Cumle kucuk ya da buyuk kelimesi icermiyor");
        }

    }
}