package tekrar;

import java.util.Scanner;

public class C13 {
    public static void main(String[] args) {
        /*
        *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
         BMI = kilo(kg) /(boy*boy)(cm)
         BMI <=20 oldukca zayifsiniz
         20<BMI<=25 Normal sinirlardasiniz
         25<BMI<=30 Sisman kategorisindesiniz
         30<BMI ==> Obez grubundasiniz.
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Boyunuzu cm olarak giriniz : ");
        double boy = scan.nextDouble()/100;  //boy cm'sini metreye donusturdum.

        System.out.println("Lutfen kilonuzu kg olarak giriniz : ");
        double kilo = scan.nextDouble();

        double bmi = kilo/(boy*boy);

        if (bmi<=20){
            System.out.println("bmi indexiniz:" + bmi + " Oldukca zayifsiniz.");
        }else if (bmi<=25){
            System.out.println("bmi indexiniz:" + bmi + " Normal sinirlardasiniz.");
        }else if (bmi<=30){
            System.out.println("bmi indexiniz:" + bmi + " Sisman kategorisindesiniz.");
        } else if (bmi>30){
            System.out.println("bmi indexiniz:" + bmi + " Obez kategorisindesiniz");
        }
    }
}
