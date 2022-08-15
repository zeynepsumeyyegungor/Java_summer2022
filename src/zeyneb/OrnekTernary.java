package zeyneb;

import java.util.Scanner;

public class OrnekTernary {
    public static void main(String[] args) {
        // kullanicidan bir harf isteyin harf kucukse "doğru",
        // buyuk harf ise "yanlis" yazdirin...

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf girin : ");
        int harf = scan.next().charAt(0);

        System.out.println(harf>'a'? ("dogru"):("yanlis"));
    }
}
