package zeyneb;

public class Deneme11 {
    public static void main(String[] args) {
        /*"Bugun hava cok guzel, tam futbol oynamalık hava";
          -verilen kelimenın asagıdaki sartlardan uygun olanı yazan birprogram yazınız
          -verilen kelime cumlede kullanılmamıs
          -verilen kelime cümlede 1 kere kullanılmıs
          -verilen kelime 1 den fazla kullanılmıs
        */

        String cumle = "Bugun hava cok guzel, tam futbol oynamalik hava.";
        int ilkkelime = cumle.indexOf("guzel");
        int ikincikelime =cumle.lastIndexOf("hava");

        if (ilkkelime==-1){
            System.out.println("Verilen kelime kullanilmamistir");
        }else if (ilkkelime==ikincikelime){
            System.out.println("Verilen kelime cumlede kullanilmis.");
        }else {
            System.out.println("Verilen kelime 1'den fazla kullanilmis.");

        }

    }
}
