package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C05_EntryUpdate {
    public static void main(String[] args) {
        //soyismi Can olanlarin bransini DataSciense yapalim

        Map<Integer,String> sinifListMap = ReusableMethods.mapOlustur();

        //entryleri alalim

        Set<Map.Entry<Integer,String>> entrySet = sinifListMap.entrySet();

        String entryValue;
        String [] entryArr;
        for (Map.Entry<Integer,String> entry:entrySet
             ) {
            entryValue = entry.getValue();
            entryArr=entryValue.split(", ");

            if (entryArr[1].equals("Can")){
                entryArr[2]="DataScience";
                entry.setValue(entryValue=entryArr[0]+ ", "+entryArr[1]+ ", "+ entryArr[2]);
            }

        }
        System.out.println(sinifListMap);
    }

}