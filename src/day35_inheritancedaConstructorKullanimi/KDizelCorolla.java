package day35_inheritancedaConstructorKullanimi;

public class KDizelCorolla extends HCorolla{
    KDizelCorolla(){
        System.out.println("KDizelCorolla parametresiz cons.");
    }
    KDizelCorolla(String isim){
        super(isim);
        System.out.println("KDizelCorolla parametreli cons");

    }
}
