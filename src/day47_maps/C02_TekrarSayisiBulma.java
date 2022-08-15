package day47_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C02_TekrarSayisiBulma {
    public static void main(String[] args) {
        //Verilen bir String'teki kullanilan harfleri
        //ve kullanilan harflerin tekrar sayisini
        // H=20 seklinde yazdirin

        String str= "Heeeeellllooooo Woooorrrrllllllddddd";
        //space'leri saymamasi icin once onlari yok edelim

        str=str.replaceAll("\\W","");

        String[] harflerArr = str.split("");

        System.out.println(Arrays.toString(harflerArr));
        //[H, e, e, e, e, e, l, l, l, l, o, o, o, o, o, W, o, o, o, o, r, r, r, r, l, l, l, l, l, l, d, d, d, d, d]

        Map<String,Integer> harfKullanimsayilariMap = new HashMap<>();
        Integer harfKullanimSayisi;
        for (String each:harflerArr
             ) {
            if (!harfKullanimsayilariMap.containsKey(each)){
                harfKullanimsayilariMap.put(each,1);
            }else {
                harfKullanimSayisi=harfKullanimsayilariMap.get(each);

                harfKullanimsayilariMap.put(each,++harfKullanimSayisi);
            }
        }
        System.out.println(harfKullanimsayilariMap);
    }
}
