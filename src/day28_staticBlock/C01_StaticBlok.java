package day28_staticBlock;

public class C01_StaticBlok {

    static int sayi;
    static {
        System.out.println("Static block calisti.");
        sayi=10;
    }
    /*
    Static block class uyelerinin tamamindan once calisir
    (main method'dan bile once)

    static block class olusturuldugunda calisir
    genellikle de class'la ilgili on ayarlamalar
    veya static block variable'lara deger atamak icin kullanilir

    static block'larin class icerisinde nerede oldugu onemli degildir
    once static block'lar calisir

     */
    public static void main(String[] args) {
        System.out.println("Main method calisti.");
        System.out.println(sayi);
    }

    static{
        System.out.println("Main method altindaki static block calisti");
    }
}
