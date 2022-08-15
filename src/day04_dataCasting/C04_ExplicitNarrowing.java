package day04_dataCasting;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {
        int sayi1=50;

        byte sayi2= (byte) sayi1;
        System.out.println(sayi2);
        /*
        genis data turundeki degeri, dar data turundeki variable'a atamak isterseniz
        Java sizin genis data turundeki degerin,dar data turunun
        sinirlarina uyup uymayacagini calistirana kadar bilemez
        ama Java Risk almaz
        Riski sifira indirmek için burada bir sorun olursa
        sorumlulugu kabul etmenizi bekler
        bunun için degerin onune parantez icerisinde istedigimiz data turunu
        yazmamiz yeterlidir.

        bu riski ustlendigimizde,3 dyrym olusabilir
        1- bizim degerimiz dar kalip degerlerine uygun olursa hic bir kayip olmadan cast olur
        2- double bir sayiyi int'a cast etmek gibi durumlarda data kaybi yasayabiliriz
        3- genis kaliptan degeri dar kaliba koydugunuzda, sinirlari asan durumlardar
        veri baskalasabilir

         */
    }
}
