package day43_interfaces_iterators;

import java.security.PublicKey;

public interface I01_InterfacesBodyOlanMethod {

    void motor();
    public void yakit();
    public abstract String aku();
    /*
    normal bir class'da oldugumuzu dusunsek
    iki tane access madifier kullanma ihtimali OLAMAZ

    asagidaki method'da goreceginiz gibi
    interface'de istisnai olarak body'si olan method'lar olusturulabilir
    Bu ozellik Java8'den sonra kullanilmaya baslamistir.
    bu ozellikten once,
    Bir interca'e yeni bir method eklememiz gerektiginde
    eskiden beri bu interface'i impelement eden tum class'lara gidip
    yeni eklenen method'u override etmemiz gerekirdi

    bu ozellik sayseinde basina default veya static keyword ekleyerek
    interface'de yeni ve body'si olan bir method olusturursak
    bu method'un child class'lar tarafindan override edilme MEBURİYET OLMAZ
    ve eskiden implement etmis class'lari degistirmemiz gerekmez

    Bu istisnai bir durumdur ve interface için olusturulan
    genel kurallari bozmaz

    Bu method'larin body'si olsa da bunlara concrete method denmez
    ama override edilme mecburiyetleri yoktur

    buradaki default kelimesi access modifier degil
    istisnai durumun belirtilmesi icindir

    O zaman nicin 2 keyword (static ve default) tanimlanmistir ?
    Bu iki farkli kelimenin amaci
    child class'lardan bu method'a nasiil erisilebilecegini belirlemek icindir
    static heyword kullanilirsa.child class'dan bu method'a erismek icin
    InterfaceAdi.methodAdi yeterli olur

    defoult keyword kullanilirsa,method'a erismek icin obje olusturulmalidir.
     */
    public default void teker(){
        System.out.println("defult... Tum arabalarin tekeri vardir");

    }
    public static void direksiyon(){
        System.out.println("static... Tum arabalarin direksiyonu vardir.");
    }
}
