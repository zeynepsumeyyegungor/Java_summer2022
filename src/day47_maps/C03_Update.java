package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03_Update {
    public static void main(String[] args) {
        /*
        map.contains(key) ==> verdigimiz key'in map'de olup olmadigini boolean olarak doner
        map.contains(value) ==> bir butun olarak value'nun map'te olup olmadigi doner


        ONEMLI NOT : map.contains(value) value'nun icindeki bir parcayi bulmada ise yaramaz
                   eger value icindeki bir parcayi aratmak istiyorsak
                   map uzerine manipulation yapmamiz lazim

                   map.get(key) ==> verilen key'e ait degeri dondurur
         */

        Map<Integer,String> sinifListMap = ReusableMethods.mapOlustur();
        System.out.println(sinifListMap);

        System.out.println(sinifListMap.containsKey(104)); //true
        System.out.println(sinifListMap.containsKey(124));  //false

        System.out.println(sinifListMap.containsValue("Ali, Can, JDev")); //true

        System.out.println(sinifListMap.containsValue("JDev"));  //false

        //Verilen map'de JDev degerlerini JavaDeveloper olarak degistirelim
        // Map'lerde replace tum value'yu degistirmek istersek kullanabilir
        // kismi degisiklilerde kullanamayiz


        ReusableMethods.tumValueSiraliYazdir(sinifListMap);
        Collection<String> valueCollection = sinifListMap.values();

        for (String each :valueCollection
             ) {
            each=each.replace("JDev","JavaDeveloper");
            System.out.println(each);
        }
        System.out.println(sinifListMap);

        //Map'i guncelleme yapmak icin key,yenideger'i map'e eklemeliyiz
        //ornegin key 101 icin value Ali, Can, JDev
        //guncelleme icin siniflListMap.key(102,Ali, Can, JavaDeveloper)

        //bunu yapabilmek icin her bir key'e ve ona ait value'ye ihtiyacim var

        Set<Integer> keySeti = sinifListMap.keySet();

        String eachValue;
        for (Integer each:keySeti
             ) {
            eachValue = sinifListMap.get(each);
            eachValue =eachValue.replace("JDev","JavaDeveloper");

            sinifListMap.put(each,eachValue);
        }
        /*
        Biz key'lerin tamamini aldik,
        herbir key'in value'sunu get'irdik
        value uzerinde degisiklik yapip
        yeni halimi put(key,yeniDeger) ile map'e koyduk
         */
        System.out.println(sinifListMap);
    }
}
