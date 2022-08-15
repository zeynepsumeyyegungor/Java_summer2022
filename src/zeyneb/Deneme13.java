package zeyneb;

import java.util.Scanner;

public class Deneme13 {
    public static void main(String[] args) {
     /* Kullanicidan evde yaşayan kişileri öğrenip,
     kişilerin yaşlarini girip ortalamalarini aliniz...
      */
        Scanner scan = new Scanner(System.in);
        System.out.println("Hanede kac kisi yasiyorsunuz ? ");
        int hane =scan.nextInt();

        System.out.println("1. kisinin yasi ;");
        int kisi1 = scan.nextInt();
        System.out.println("2. kisinin yasi ;");
        int kisi2 = scan.nextInt();
        System.out.println("3. kisinin yasi ;");
        int kisi3 = scan.nextInt();
        System.out.println("4. kisinin yasi ;");
        int kisi4 = scan.nextInt();

        double sonuc =((kisi1+kisi2+kisi3+kisi4)/hane);
        System.out.println("Hanenin ortalama yasi : " + sonuc);



    }
}
