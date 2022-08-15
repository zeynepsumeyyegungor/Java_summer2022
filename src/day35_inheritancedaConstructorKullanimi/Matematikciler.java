package day35_inheritancedaConstructorKullanimi;

public class Matematikciler extends LOgretmen{
    Matematikciler(){
        System.out.println("Matematik Parametresiz cons.");
    }
    Matematikciler(String isim){
        this();
        System.out.println("Matematik parametreli cons.");
    }
}
