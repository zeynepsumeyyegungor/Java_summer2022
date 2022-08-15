package day19_Scope;

public class C02_StaticVariables {
    static int staticSayi=10;
    String isim="Mehmet";

    static int degersizStaticVar;
    int degersizIntanceVariable;
    /*
    class level'daki variable'lara deger atamasak da Java kabul ediyor

     */

    public static void main(String[] args) {
         /*
        bir varible static alusturulduysa
        objeler icin degil class icin gecerlidir
         */
        System.out.println(staticSayi); //10
        staticMethod();
        staticSayi=12;
        System.out.println(staticSayi); //12
        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod();
        System.out.println(staticSayi); //20

        /*
        şnstance bir variable'in degerini bulmak icin objenin olusturmasindan itibaren
        istenen satira kadar kodu takip etmeliyiz

        Static variable'da ise class'in en basindan baslayarak
        istenen satira kadar kodu takip edip
        stativ variable'in son degerini bulmamiz gerekir
         */

    }


    public static void staticMethod(){
        System.out.println(staticSayi); //10



    }


    public  void  staticOlmayanMethod(){
       /*
       static variable'lar class icerisinden her yerden ulasilabilir
       static olsun veya olmasın tum method'lar static variable'lari görebilir ve degistirebilir
       farkli method'larda static variable'in hangi degeri olacagini bilmek istiyorsak
       class'in basindan itibaren kodun calismasini takip etmeliyiz
       method ne zman cagrilirsa o anki static variable degerini method'da kullanabiliriz
        */
        System.out.println(staticSayi);  //12
        staticSayi =20;


    }
}
