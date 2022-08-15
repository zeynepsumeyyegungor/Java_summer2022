package day36_inheritanceDataTypeKullanimi;

public class DIsci extends BMuhasebe{

    protected int saatUcreti=11;
    protected int gunlukMesai=7;

    protected void maasIsci(){
        System.out.println("Memurlar : "+(30*saatUcreti*gunlukMesai)+ " maas alir.");
    }
    protected  void ozelSigortaIsci(){
        System.out.println("Memurlar %70 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        BMuhasebe isc1 = new DIsci();
        /*
        Bir obje olusturulurken
        data turu ve constructor ayni class'dan ise
        direk o class'a gidiyorduk

        eger data turu ve constructo farkli ise
        Obje constructor'in oldugu class'in objesidir
        ancak,bizden istenen
        Isci class'indaki spesifik ozellikler degil
        Bir iscinin muhasebe class'indaki
        tum calisanlarla beraber sahip oldugu
        genel ozelliklerini yazdirir

         */

        System.out.println(isc1.gunlukMesai); // Muhasebe-8
        System.out.println(isc1.saatUcreti);  //Muhasebe-10
        isc1.maas(); // Muhasebe Maas - Personel minimum : 2400 maas alir.
        isc1.ozelSigorta(); //Muhasebe - Isteyen calisanlara %50 indirimli ozel sigorta yapilir
        isc1.sigorta();//Personel
        System.out.println(isc1.isim); //Personel
        System.out.println(isc1.soyisim); //Personel
        System.out.println(isc1.departmant); //Personel


        Apersonel isc2=new DIsci();


        //System.out.println(isc2.gunlukMesai); // Muhasebe-8
        //System.out.println(isc2.saatUcreti);  //Muhasebe-10
        //isc2.ozelSigorta(); //Muhasebe - Isteyen calisanlara %50 indirimli ozel sigorta yapilir
        isc2.sigorta();//Personel
        System.out.println(isc2.isim); //Personel
        System.out.println(isc2.soyisim); //Personel
        System.out.println(isc2.departmant); //Personel

        /*
        Eger Data turu olan class'da aradigimiz ozellik yoksa
        varsa onun parent'ina gidebilir
        ama child'a donus olmaz
        aradigi ozelligi bulamazsa CTE verir
         */


    }
}
