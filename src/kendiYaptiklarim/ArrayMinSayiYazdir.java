package kendiYaptiklarim;

public class ArrayMinSayiYazdir {
    public static void main(String[] args) {
        //verilen bir int array'deki en kucuk sayiyi yazdiran bir method olustur

        int [] sayilar={3,4,6,9,0,1,2,4,5,-3,-9,6};

        minSAyiyiYazdir(sayilar);
    }

    public static void minSAyiyiYazdir(int[] sayilar) {

        int minSayi=sayilar[0];
        for (int i = 1; i <sayilar.length ; i++) {
            if (sayilar[i]<minSayi){
                minSayi=sayilar[i];
            }
        }


        System.out.println("Array'deki en kucuk sayi = " +minSayi);
    }
}
