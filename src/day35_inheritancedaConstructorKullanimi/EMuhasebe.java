package day35_inheritancedaConstructorKullanimi;

public class EMuhasebe extends Dpersonel{
    EMuhasebe(){
        System.out.println("Muhasebe parametresiz cons.");
    }
    EMuhasebe(String isim){
        System.out.println("Muhasebe parametreli cons.");
    }
}
