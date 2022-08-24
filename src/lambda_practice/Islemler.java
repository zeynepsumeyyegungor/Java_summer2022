package lambda_practice;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {
    static List<Kisi> ogrtmnList = new ArrayList<>();
    static List<Kisi> ogrncList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;
    // static yazmamizin sebebi tum methodlardan ulasmak icin.
    // gokteki ay gibi heryeden ulaşılabilsin
    public static void girisPaneli() {
        System.out.println("====================================");
        System.out.println("ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ");
        System.out.println("====================================");
        System.out.println("1- ÖĞRENCİ İŞLEMLERİ");
        System.out.println("2- ÖĞRETMEN İŞLEMLERİ");
        System.out.println("Q- ÇIKIŞ");
        String secim = scan.next().toUpperCase();
        switch (secim) {
            case "1":
                kisiTuru = "OGRENCİ";
                islemMenusu();
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;
            case "Q":
                cikis();
                break;
            default:
                System.out.println("Hatali giris yaptiniz");
                girisPaneli();
                break;
        }
    }
    private static void islemMenusu() {
        System.out.println("Sectigin kisi turu :" + kisiTuru + ", lutfen asagidaki islemleri seciniz");
        System.out.println("============= İŞLEMLER =============\n" +
                "         1-EKLEME\n" +
                "         2-ARAMA\n" +
                "         3-LİSTELEME\n" +
                "         4-SİLME\n" +
                "         5-ANA MENÜ\n" +
                "         0-ÇIKIŞ");
        System.out.println("İslem tercihinizi giriniz ");
        int secilenIslem = scan.nextInt();
        switch (secilenIslem) {
            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
                arama();
                islemMenusu();
                break;
            case 3:
                listeleme();
                islemMenusu();
                break;
            case 4:
                silme();
                islemMenusu();
                break;
            case 5:
                girisPaneli();
                break;
            case 0:
                cikis();
                break;
            default:
                System.out.println("guzel bir sey gir");
                islemMenusu();
                break;
        }
    }
    private static void arama() {
        System.out.println("Lutfen aramak istediginiz " + kisiTuru + "'in kimlik numarasini giriniz");
        String kimlikNo = scan.next();
        boolean varMi = false;
        for (int i = 0; i < ogrncList.size(); i++) {
            if (kisiTuru.equals("OGRENCİ")) {
                if (ogrncList.get(i).getKimlikNo().equals(kimlikNo)) {
                    System.out.println("Aradiginiz " + kisiTuru + " " + ogrncList.get(i));
                    varMi = true;
                    break;
                }
            }
        }
        for (int i = 0; i < ogrtmnList.size(); i++) {
            if (kisiTuru.equals("OGRETMEN")) {
                if (ogrtmnList.get(i).getKimlikNo().equals(kimlikNo)) {
                    System.out.println("Aradiginiz " + kisiTuru + " " + ogrtmnList.get(i));
                    varMi = true;
                }
            } if (!varMi) {
                System.out.println("Aradiginiz " + kisiTuru + " " + " okulumuzda mevcut degildir");
            }
        }
    }
    private static void silme() {
        System.out.println("Lutfen silmek istediginiz " + kisiTuru + "'in kimlik numarasini giriniz");
        String kimlikNo = scan.next();
        boolean varMi = false;
        for (int i = 0; i < ogrncList.size(); i++) {
            if (kisiTuru == "OGRENCİ") {
                if (ogrncList.get(i).getKimlikNo().equals(kimlikNo)) {
                    ogrncList.remove(i);
                    System.out.println("Silme işleminiz başarıyla gerçekleştirilmiştir");
                    varMi = true;
                    break;
                }
            }
        }
        for (int i = 0; i < ogrncList.size(); i++) {
            if (kisiTuru == "OGRETMEN") {
                if (ogrtmnList.get(i).getKimlikNo().equals(kimlikNo)) {
                    ogrtmnList.remove(i);
                    System.out.println("Silme işleminiz başarıyla gerçekleştirilmiştir");
                    varMi = true;
                }
            } if (varMi==false) {
                System.out.println("Bu " + kisiTuru + " listede mevcut değildir");
            }
        }
    }
    private static void cikis() {
        System.out.println("Iyi gunler dileriz, yine bekleriz");
    }
    private static void listeleme() {
        if (kisiTuru.equals("OGRENCİ")){
            System.out.println("Ogrenci listesi : " + ogrncList);
        }else{
            System.out.println("Ogretmen listesi : " + ogrtmnList);
        }
    }
    private static void ekle() { // bu method hem ogrenci hem ogretmen eklemek icin tasarlandi
        System.out.println("**** "+ kisiTuru+" ekleme sayfasina hosgeldin");
        System.out.println("isim soyisim giriniz");
        scan.nextLine();
        String adSoyad=scan.nextLine();
        System.out.println("kimlik giriniz");
        String kimlikNo=scan.nextLine();
        System.out.println("yas giriniz");
        int yas=scan.nextInt();
        int kisiSayisi=1;
        if (kisiTuru.equals("OGRENCİ")){
            System.out.println(kisiSayisi+ ". Ogrencinin numarasini giriniz");
            scan.nextLine();
            String ögrenciNo = scan.next();
            System.out.println("Sinif giriniz");
            scan.nextLine();
            String sınıf = scan.nextLine();
            Ogrenci ogr = new Ogrenci(adSoyad, kimlikNo, yas, ögrenciNo, sınıf);//p'li cons dan ögrnci obje create edıldi
            ogrncList.add(ogr);
            kisiSayisi++;
            //System.out.println(ogrncList);
        }else{
            kisiSayisi=1;
            System.out.println("sicil no gir");
            String sicilNo=scan.next();
            scan.nextLine();
            System.out.println("bolum gir");
            String bolum=scan.nextLine();
            Ogretmen ogretmen=new Ogretmen(adSoyad,kimlikNo,yas,bolum,sicilNo);
            ogrtmnList.add(ogretmen);
            kisiSayisi++;
            //System.out.println(ogrtmnList);
        }
        System.out.println("Ekleme isleminiz basariyla gerceklestirilmistir");
    }
}

