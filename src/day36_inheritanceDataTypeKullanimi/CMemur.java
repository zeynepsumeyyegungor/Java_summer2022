package day36_inheritanceDataTypeKullanimi;

import java.util.ArrayList;

public class CMemur extends BMuhasebe{
    protected int saatUcreti=12;
    protected int gunlukMesai=9;

    protected void maas(){
        System.out.println("Memurlar : "+(30*saatUcreti*gunlukMesai)+ " maas alir.");
    }
    protected  void ozelSigorta(){
        System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        CMemur mmr1=new CMemur();
        System.out.println(mmr1.gunlukMesai); //9
        System.out.println(mmr1.saatUcreti);  //12
        mmr1.maas(); //Memurlar : 3240 maas alir.
        mmr1.ozelSigorta(); //Memurlar %60 indirimli ozel sigorta yaptirabilir
        mmr1.sigorta();
        System.out.println(mmr1.isim); //Isim belirtilmedi
        System.out.println(mmr1.soyisim); //Soyisim belirtilmedi
        System.out.println(mmr1.departmant); //Departmant belirtilmedi


        BMuhasebe mhsb1=new BMuhasebe();
        /*
        Her ne kadar Memur class'inin icinde olsam da
        olusturdugum obje Muhasebe Class'indan
        cunku data turu ve constructor BMuhasebe


        String str="Murat";
        ArrayList<Integer> list=new ArrayList<>();
        Integer sayi=20;

        BMuhasebe class'i da obje olusturabilen bir class'dir yeni data turu
         */
        System.out.println(mhsb1.gunlukMesai); //8 muhasebe
        System.out.println(mhsb1.saatUcreti);  //10 muhasebe
        mhsb1.maas(); //Muhasebe
        mhsb1.ozelSigorta(); //Muhasebe
        mhsb1.sigorta();
        System.out.println(mhsb1.isim); //Personel
        System.out.println(mhsb1.soyisim); //Personel
        System.out.println(mhsb1.departmant); //Personel



    }
}
