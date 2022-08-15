package day41_abstractClass_Interface;

public class HA160 extends FMercedes{
    /*
    Abstract parent silsilesinden gelen
    ilk concrete class
    Parent'i olan tum class'daki abstract method'lari
    concrete hale donusturmek (override etmek) ZORUNDADIR

    Bu kuralin istisnasi
    parent class'lardan herhangi birinde
    concrete hale donusturulmus,abstract method'lardir
     */
    public static void main(String[] args) {
        HA160 arb1=new HA160();
        //concrete bir class'tan istedigimiz bir objeyi uretebilirz

        FMercedes arb2=new FMercedes();
        //mercedes'te concrete

        //EToyota arb3=new EToyota();
        EToyota arb4= new GCorolla();
        //Absract class'lar constructor barindirir ama obje uretemezler
        //Toyota class'i abstract oldugundan obje uretilemez
    }
}
