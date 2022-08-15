package day11_stringManipulations;

public class C01_indexOf {
    public static void main(String[] args) {


        String str= "Java ogrenmek cok guzel";
        /*
        Verilen bir String'de herhangi bir String veya char'in
        ilk kullanildigi index'i bize dondurur.
         */

        System.out.println(str.indexOf('g'));  //6
        System.out.println(str.indexOf("r"));  //7
        System.out.println(str.indexOf("j"));   // -1

        System.out.println(str.indexOf("mek"));  // 10

        // eger istedigimiz index'ten sonrasini kontrol etmek istersek
        // o zaman ayni method'u iki parametreli olarak kullaniriz.

        System.out.println(str.indexOf("g",(6+1))); //yazilan index'ten baslar

        //yukaridaki str'da 2. ve 3. e'nin indexlerini bulun.
        // 2. e'yi bulabilmek icin 1. e'nin index'ine ihtiyacim var

        int ilke=str.indexOf("e");
        int ikincie=str.indexOf("e",ilke+1);

        //eger 2. e varsa 3.e'nin olup olmadigina bakarim
        // ve varsa index'i yazdiralim:

        if (ikincie==-1){
            System.out.println("verilen str'da 2.e yok.");
        }else {
            int ucuncue=str.indexOf("e",ikincie+1);
            if (ucuncue==-1){
                System.out.println("verilen str'da 3. e yok.");
            } else {
                System.out.println("verilen str'daki 3. e'nin index'i : "+ ucuncue);
            }

        }


    }
}
