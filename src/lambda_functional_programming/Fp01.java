package lambda_functional_programming;

import java.util.ArrayList;
import java.util.List;

public class Fp01 {

    /*
    1) Lambda (Functional Programming) Java 8 ile kullanilmaya baslamistir
    2) Functional Programming'de "Ne yapilacak" (What to do) uzerine yogunlasilir.
    Structured Programming "Nasil Yapilacak" uzerine yogunlasir.
    3) Functional Programming Arrays ve Collections ile kullanilir.
    4) "entrySet()" Methodu ile Map, Set'e donusturulerek Functional Programming'de kullanilabilir

     */
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);

        listElemanlariniYazdirStructred(liste);
        System.out.println();
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirStructured(liste);
        System.out.println();
        System.out.println("Funtional :");
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekrarsizTekElemanlarinKupunuYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami(liste);
        System.out.println();
        tekrarsizCiftElemanlarinCarpimi(liste);
        getMaxEleman(liste);
        getMaxEleman02(liste);
        getYedidenBuyukCiftMin(liste);

    }


    //1)Ardisik list elemanlarini ayni satirda aralarinda bosluk birakarak yazdiran bir method olusturun (Structured)


    private static void listElemanlariniYazdirStructred(List<Integer> liste) {
        for (Integer w : liste) {

            System.out.print(w + " ");
        }
    }

    //1)Ardisik list elemanlarini ayni satirda aralarinda bosluk birakarak yazdiran bir method olusturun (Functional)
    private static void listElemanlariniYazdirFunctional(List<Integer> liste) {
        liste.stream().forEach(t -> System.out.print(t + " "));
        //stream() methodu collection'dan elementleri akisa dahil etmek icin ve methodlara ulasmak icin kullanilir
    }

    //2)Cift sayi olan list elemanlarini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)
    public static void ciftElemanlariYazdirStructured(List<Integer> liste) {
        for (Integer w : liste) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    //2)Cift sayi olan list elemanlarini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void ciftElemanlariYazdirFunctional(List<Integer> liste) {
        liste.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));
    }
    //3) Ardisik tek list elementlerinin karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void tekElemanlarinKareleriniYazdir(List<Integer> liste) {
        liste.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));
        //elemanlarin degerleri degisecekse map methodu kullanilir

    }

    //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.
    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> liste) {
        liste.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));
    }

    //5) Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.
    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> liste) {
        Integer toplam = liste.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);

        System.out.println(toplam);
    }

    //6) Tekrarsiz cift elemanlarin kupunun carpimini hesaplayan bir method olusturun

    public static void tekrarsizCiftElemanlarinCarpimi(List<Integer> liste){
        Integer carpim = liste.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)->t*u);
        System.out.println(carpim);
    }

    //7) List elemanlari arasinda en buyuk degeri bulan bir method olusturun.
    // 1. Yol
    public static void getMaxEleman(List<Integer> liste){

        Integer max = liste.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)->t>u ? t : u);
        System.out.println(max);
    }

    //2. Yol :

    public static void getMaxEleman02(List<Integer>liste){
        Integer max = liste.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u)->u);
        System.out.println("max = " + max);
    }

      //Ödev
      //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile)
      // 9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.

    public static void getYedidenBuyukCiftMin(List<Integer> liste){
        Integer min =  liste.stream().distinct().filter(t->t%2==0).filter(t->t>7).reduce(Integer.MAX_VALUE,(t,u)-> t<u ? t : u);
        System.out.println(min);
    }
}