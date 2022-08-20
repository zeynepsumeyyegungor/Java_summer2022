package lambda_functional_programming;

import java.util.stream.IntStream;

public class Fp04 {
    public static void main(String[] args) {
        System.out.println(get7den100eToplam());
        System.out.println("get7den100eToplam02() = " + get7den100eToplam02());
        System.out.println("get7den11ecarpim = " + get2den11ecarpim());
        System.out.println("faktoryelHesapla(3) = " + faktoryelHesapla(3));
        System.out.println(verilenIkşSayiArasindakiCiftSayilarinToplami(11,5));
        System.out.println(ikiSayiArasindakiTumSayilarinRakamlariToplami(23,32));

    }
    //1) 7'den 100'e kadar integer degerlerinin toplamini bulan method olusturun
    //1. Yol:
    public static int get7den100eToplam() {
        return IntStream.range(7, 101).reduce(0, Math::addExact);
    }
    //2. Yol:
    public static int get7den100eToplam02(){
        return IntStream.rangeClosed(7,100).reduce(Math::addExact).getAsInt();
    }
    //2) 2'den 11'e kadar integer degerlerinin carpimini bulan bir method olusturun.
    public static int get2den11ecarpim(){
        return IntStream.rangeClosed(7,100).reduce(Math::addExact).getAsInt();
    }

    // 3) Verilen bir sayinin faktoryelini hesaplayan bir method olusturun
    public static int faktoryelHesapla(int x){
        if (x>0){
            return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();
        }
        System.out.println("0'dan buyuk deger giriniz : ");
        return 0;
    }

    // 4) Verilen iki sayı arasındaki çift sayıların toplamını bulan bir method oluşturun.
    public static int verilenIkşSayiArasindakiCiftSayilarinToplami(int x,int y){
        int z = 0;
        if (x>y){
            z = x;
            x = y;
            y = z;
        }

        return IntStream.rangeClosed(x,y).filter(Utils::ciftElemaniSec).sum();
    }
    //5) Verilen iki sayı arasındaki tüm sayıların rakamlarının toplamını hesaplayan bir method oluşturun.
    //  23 and 32 ==> 2+3  +  2+4  +  2+5  +  2+6  +  2+7  +   2+8  +   2+9  +   3+0  +   3+1  +   3+2 ==> 68

    public static int ikiSayiArasindakiTumSayilarinRakamlariToplami(int x,int y){
        return IntStream.rangeClosed(x,y).map(Utils::rakamlarToplaminiAl).sum();
    }
}
