package day15_overloading_forloop;

public class C06_StringTerseCevirme {
    public static void main(String[] args) {
        //input olarak verilen Stringi terse cevirip yazdiran bir method olusturun

        String input = "Java gun gectikce guzellesiyor.";

        tertenYazdir(input);
    }

    public static void tertenYazdir(String input) {

        String tersInput=input.substring(input.length()-1);

        for (int i =input.length()-2;  i>=0 ; i--){
            tersInput+=input.substring(i,i+1);
        }
        System.out.println(tersInput);

    }

    public static void terstenYazdir(String zekeriya) {
    }
}
