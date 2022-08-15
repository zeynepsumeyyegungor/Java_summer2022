package day08_ifStatements;

import java.util.Scanner;

public class C02_IfElseIfStatements {
    public static void main(String[] args) {
        // Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
        // Not'u harf sistemine cevirip yazdirin.
        // 50’den kucukse "D",
        // 50'den eşit veya büyük -60dan kucukse "C"
        // 60'a esit veya buyuk-80'den kucuk "B",
        // 80'e esit ve buyukse "A",
        // gecersiz not girilirse uyarı verelim

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 0'dan 100'e kadar bir not degeri girin :"  );
        double note = scan.nextDouble();

        if (note<0  ||  note>100){
            System.out.println("Lutfen gecerli bir not giriniz :");
            //bu satira geldiysek notumuz 0-100 arasindadir
        } else if (note<50){
            System.out.println("Notunuz : D");
        } else if (note<60) {
            System.out.println("Notunuz : C");
        } else if (note<80) {
            System.out.println("Notunuz : B");
        } else {
            System.out.println("Notunuz : A");
        }


    }
}
