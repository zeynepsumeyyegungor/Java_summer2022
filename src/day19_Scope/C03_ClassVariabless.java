package day19_Scope;

public class C03_ClassVariabless {

    public static void main(String[] args) {
        /*
        Farklı bir class'da calisirken
        her hangi bi class adini yazip .'ya basarsak
        adini yazdigimiz class'daki tum STATİC class uyelerini gorebilir
        ve kullanabiliriz
         */

        C02_StaticVariables.staticMethod(); //10
        System.out.println(C02_StaticVariables.staticSayi);  //10
        System.out.println(C02_StaticVariables.degersizStaticVar);  //

        /*
        Class Level variable'lara deger atayip atamamak bize kalmistir
        istersek deger atamasi yapariz,istemezsek deger atamayiz
        Eger deger atamazsak Java atadigimiz o degeri kabul eder
        deger atamazsak Java bu variable'lara default bir deger atamasi yapar

        int --> 0
        String --> null
        blooean --> false
        char --> ' ' (hiclik)
         */

        /*
        baska class'daki instance variable'lara obje olusturarak olasabiliriz
         */

        C02_StaticVariables obje1=new C02_StaticVariables();
        obje1.staticOlmayanMethod(); //10
        //bu method icinde staticSayi=20 oldu
        System.out.println(obje1.isim); // Mehmet
        System.out.println(obje1.degersizIntanceVariable); //0

        System.out.println(C02_StaticVariables.staticSayi); //20;
        /*
        Farrkli bir class'tan C02 clasindan method ve variable'lari kullandigimda
        C02 class'inin tamami degil sadece benim cagirdigim class uyeleri calisir

         */
    }
}
