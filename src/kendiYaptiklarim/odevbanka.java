package kendiYaptiklarim;

import java.util.Scanner;

public class odevbanka {
    public static void main(String[] args) {
        /*
        Kullanicidan ismini, soyismini ve bosluk birakmadan 16 hane olarak kredi karti numarasini alin.
        Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde,
        KK numarasini ise 4 rakamlik 4 blok ve aralarinda bosluk olacak sekilde duzelten 2 method yazin,
        ve programda kullanabilmek icin duzenlenmis hallerini geri dondurun.
         */
        String isim = kullanıcıadı();
        String soyisim = soyisim();
        String kartnumarasi = kartno();
        System.out.println("soyisim:" +soyisim);
        System.out.println("isim :" + isim);
        System.out.println("kartno:" + kartnumarasi);

    }
    public static String kartno() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kart numarasini giriniz");
        String kartno = scan.nextLine();

        kartno = kartno.substring(0,4) +" "+kartno.substring(4,8) + " " +kartno.substring(8,12)+ " " +kartno.substring(12);
        return kartno;
    }
    public static String kullanıcıadı() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim = scan.nextLine();

        isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
        return (isim+" ");
    }

    public static String soyisim() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen soyisminizi giriniz");
        String soyisim = scan.nextLine();

        soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();
        return (soyisim + " " );
    }
}
