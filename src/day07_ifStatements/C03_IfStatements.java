package day07_ifStatements;

public class C03_IfStatements {
    public static void main(String[] args) {
        /* bir if statement'da { kullanilmazsa
        Java ilk satiri sart ile baglar, sonraki satirlar bagimsiz olur

        eger birden fazla satir aynı if sartina baglanmis ise mutlaka { kullanmaliyiz
         */
        int sayi = 23;
        if (sayi>0)
            System.out.println("sayi pozitif");
            System.out.println("pozitif kalacaktir");

        if (sayi%2==0)
            System.out.println("sayi cift");
            System.out.println("cift kalacaktir");

        if (sayi%5==0) {
            System.out.println("sayi 5'in tam kati");

    }
}}
