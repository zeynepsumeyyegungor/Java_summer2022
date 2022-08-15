package zeyneb;

public class oodev {
    public static void main(String[] args) {

        /*
        100'den 0'a kadar 13'e tam bölünebilen sayıları ekrana yazdırınız (büyükten küçüğe).
        Ekran Çıktısı asagidaki sekilde olsun; ayrica sonrasinda bu sayilarin toplamini da yazdirin
        istenen sonuc :
         91
         78
         65
         52
         39
         26
         13       */

        int bas=100;
        int son=0;
        int temp= bas;
        int rakamlarTop=0;
        int sayi =0;

        while (son<temp){
            if (temp%13==0){
                System.out.println(temp + " ");
            }
            temp--;
            rakamlarTop+=temp;
        }
        System.out.println("");
        System.out.println("* * *");

        System.out.println("Rakamlar toplami : " +rakamlarTop);
    }
}
