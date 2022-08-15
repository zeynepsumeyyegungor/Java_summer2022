package day34_inheeritance;

public class Isci extends Personel {
    /*
    Normal hayatimizda parent cocuk sahibi olmaya karar verebilir
    Java'da ise child class'lar ozelliklerini inherit etmek istedikleri
    class'i kendilerine parent edinirler.

    Mesela isci class'ini olusturunca nelere ihtiyaci var diye düsünsek
    personel class'indaki tum variable ve
    method'lara ihtiyaci oldugunu gorebiliriz
    Bu durumda yeniden o variable ve method'lari olusturmak yerine
    Personel class'ini kendimize parent ediniriz.

    Bir class'i parent edinmek icin extends keyword kullanmaliyiz

    Bir class baska bir class'i parent edindiginde
    1- parent class'daki tum ozelliklere(variable+method) otomatik olarak sahip olur
    2- parent class'daki ozelliklerden bazilarini kendine uyarlayabilir
    3- parent class'da olmayan bazi yeni ozellikler olusturabilir
    not: parent class'daki ozelliklerden hicbirini reddedemez ama degistirebilir
     */

    int persNo=1001;
    public static void main(String[] args) {
        Isci isci1=new Isci();
        System.out.println(isci1.isim); //Isim belirtilmedi
        //Kendi class'imizda yok onun icin parent'e gidiyoruz
        isci1.isim="Selim";
        System.out.println(isci1.persNo);  //1001 ,kendi class'imizda varsa onu kullaniriz

        isci1.maas();  //

    }
    public void maas(){
        System.out.println("Isciler min. 15€ saat ucreti alıyor");
    }

    public void ozelSigorta(){
        System.out.println("Iscilerden isteyene %50 indirimli ozel sigorta yapılıyor.");
    }

}
