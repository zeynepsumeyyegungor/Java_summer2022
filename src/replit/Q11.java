package replit;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        /*
        Kullanıcıya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir program yazın (BMI)
         IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)
         BMI 18,5'in altındaysa zayıfsınız
         BMI 18,5 ile 25 arasında ise kilonuz idealdir
         BMI 25-30 arasındaysa şişmansınız
         BMI 30'dan büyük veya eşitse, obez
         Input:
         Output:
         Agirlik : 71
         Boy : 1,72
         BMI : 23.99945916711736
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kilonuzu girin (kg) : ");
        double kilo = scan.nextDouble();
        System.out.println("Lutfen boyunuzu girin (m) : ");
        double boy = scan.nextDouble();

        double bmi=kilo/(boy*boy);
        System.out.println("BMI : " +bmi);
        if (bmi<=18.5){
            System.out.println("Zayifsiniz");
        }
        if (bmi>=18.5 && bmi<=25){
            System.out.println("Kilonuz idealdir");
        }
        if (bmi>=30){
            System.out.println("Obez");
        }

    }
}