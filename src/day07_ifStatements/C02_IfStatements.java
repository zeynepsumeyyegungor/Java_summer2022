package day07_ifStatements;

public class C02_IfStatements {
    public static void main(String[] args) {

        int sayi =10;
        if (sayi>0) {
            System.out.println("sayi pozitif");
        }
        if (sayi%2==0){
            System.out.println("sayi cift");
        }
        if (sayi%5==0) {
            System.out.println("sayi 5'in tam kati");
            /* basit if cumleleri kodun diger parcalarindan bagimsizdir
            sadece bir sart kontrol eder ,sart baglaniyorsa,if body calisir,yoksa calismaz
            birden fazla basit if cumlesi varsa girilen sarta bagli olarak,
             */
        }
    }
}

