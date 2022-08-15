package day47_maps;

import day46_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C04_Entry {
    public static void main(String[] args) {

        Map<Integer,String> sinifListMAp = ReusableMethods.mapOlustur();
        System.out.println(sinifListMAp);

        //her bir elemani alt alta yazdirin

        Set<Map.Entry<Integer,String>> sinifEntrySet = sinifListMAp.entrySet();

        for (Map.Entry<Integer,String> each: sinifEntrySet
             ) {
            System.out.println(each);
        }

        // Map'in tum elemanlarında varsa Tester kurs ismini QA olarak degistirelim

        String eachValue;
        for (Map.Entry<Integer,String> each:sinifEntrySet
             ) {
            eachValue = each.getValue();
            eachValue = eachValue.replace("Tester","QA");
            each.setValue(eachValue);
        }
        System.out.println(sinifListMAp);
    }
}
