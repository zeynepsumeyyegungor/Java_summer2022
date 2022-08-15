package day03_scranner;

public class C01_AsciiTable {
    public static void main(String[] args) {

        // bir tamsayi, bir de char degisken olusturun ve toplamlarini yazdirin.

        int sayi=10;
        char harf='a';
        String str="banan";


        System.out.println(sayi+harf);   //10a degil 107 oldu
        System.out.println(sayi*harf);   //
        System.out.println(str+harf);    // banana
        System.out.println(harf+2);
        System.out.println(str+sayi+harf);   // banan10a
        System.out.println("" +sayi+harf);   //10a

    }
}
