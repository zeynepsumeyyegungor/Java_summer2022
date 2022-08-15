package tekrar;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {
        /*
          Kullanicidan  Y/N ikilisinden birisini girdiginde girdigi degeri
          ekrana yazdiran java kodunu yaziniz.
          INPUT : Y , N
          OUTPUT : YES ; NO
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Y/N ikilisinden birini girin : ");
        char karakter = scan.next().charAt(0);
        if (karakter=='Y' || karakter=='y'){
            System.out.println("YES");
        }else if (karakter=='N' || karakter=='n'){
            System.out.println("NO");
        }else {
            System.out.println("Yanlis karakter girdiniz.Lutfen sadece Y/N ikilisinden birini seciniz");
        }
    }
}
