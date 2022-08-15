package day12_stringManipulations;

public class C02_replaceAll {
    public static void main(String[] args) {

        String str = "1Bu2gu3n Ja*va- cok g3uz/el";

        //str'i "Bugun Java cok guzel" haline getirin.
        // replaceAll() 'deki All'in amaci ayni ozellikteki tum karakterleri kapsamasidir
        //butun sayilari sil
        //butun ozel karakterleri sil

        //tum ozel karakterleri silelim dedigimizde space'ler de siliniyor,
        //space'lerin korumak icin en basta onların yerine cumlede bulunmayacak
        //bir string koyalim
        //"qazwsx"

        str = str.replaceAll(" ","qazwsx");
        str = str.replaceAll("\\W","");
        System.out.println(str);  //1Bu2gu3nJavacokg3uzel

        str = str.replaceAll("\\d","");
        //istenmeyen ozel karakter ve sayilardan kurtulduk,
        // simdi space'leri geri getirelim.

        str = str.replace("qazwsx"," ");
        System.out.println(str);


    }
}
