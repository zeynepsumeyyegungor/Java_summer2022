package day12_stringManipulations;

public class C01_replace {
    public static void main(String[] args) {

        String str= " Bu gun ha va cok gu zel";
        System.out.println(str.replace(" ",""));

        // hava kelimesini java yapalim

        System.out.println(str.replace("h","J").replace(" ",""));

        //gu zel yerine harika yapalim.

        System.out.println(str.replace("gu zel","harika"));

        //cumleyi replace kullanip Bugun Java cok guzel yapalim

        str=str.replace(" Bu gun","Bugun")
                .replace("ha va","Java")
                .replace("gu zel","guzel");

        System.out.println(str);
    }
}
