package zeyneb;

import java.util.Scanner;

public class Deneme4 {
    public static void main(String[] args) {
        /*
        kullanıcıdan üçgenin kenar uzunluklarını isteyin
        üçgenin eşkenar üçgen olup olmadığını yazdırın
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunlugunu gir");

        int kenar1= scanner.nextInt();
        int kenar2= scanner.nextInt();
        int kenar3= scanner.nextInt();

        if (kenar1==kenar2 && kenar1==kenar3 ) {
            System.out.println("bu eşkenar ucgendir");
        }
        else {
            System.out.println("eskenar ucgen degildir");
        }
    }
}
