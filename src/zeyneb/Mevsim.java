package zeyneb;

import java.util.Scanner;

public class Mevsim {
    public static void main(String[] args) {
        //kullanıcıdan mevsim isimleri isteyiniz mevsimlere göre ayları yazdırınız

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ay ismini girin : ");
        String ay = scan.next().toLowerCase();

        if (ay.equals("aralik") || ay.equals("ocak") || ay.equals("subat")) {
            System.out.println("mevsim :" + "kis");
        } else if (ay.equals("mart") || ay.equals("nisan") || ay.equals("mayis")){
            System.out.println("mevsim :" + "ilkbahar");
        } else if (ay.equals("haziran") || ay.equals("temmuz") || ay.equals("agustos")) {
            System.out.println("mevsim :" + "yaz");
        } else if (ay.equals("eylul") || ay.equals("ekim") || ay.equals("kasim")){
            System.out.println("mevsim :" + "sonbahar");
        } else {
        }
    }
}