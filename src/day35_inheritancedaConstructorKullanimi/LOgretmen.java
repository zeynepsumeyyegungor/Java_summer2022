package day35_inheritancedaConstructorKullanimi;

public class LOgretmen {
    LOgretmen(){
        System.out.println("LOgretmen parametresiz cons.");
    }
    LOgretmen(String isim){
        this();
        System.out.println("LOgretmen parametreli cons.");
    }

    public static void main(String[] args) {
        Matematikciler obj1=new Matematikciler("Tugba");
    }
}
