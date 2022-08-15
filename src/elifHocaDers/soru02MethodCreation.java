package elifHocaDers;

import java.util.Scanner;

public class soru02MethodCreation {
    public static void main(String[] args) {
        /*
        cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
        */
        Scanner scan = new Scanner(System.in);

        System.out.print("Metre ve km'ye donusturmek istediginiz cm degerini giriniz :");
        double santiMeterValue=scan.nextDouble();

        convertSM(santiMeterValue);
    }

    public static void convertSM(double santiMeterValue) {
        double meter=santiMeterValue/100;
        double kMeter=santiMeterValue/100000;

        System.out.println("girdiginiz santimetre degeri :" +santiMeterValue +" :" + meter + " m dir, " + kMeter + " km dir");

    }

}
