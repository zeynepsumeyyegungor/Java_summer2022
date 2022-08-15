package day07_ifStatements;

import java.util.Scanner;

public class C07_ifElseIfStatements {
    public static void main(String[] args) {
        /*
        bir önceki soruda, kullanici negatif deger girerse uyaralim
         */
        Scanner scan = new Scanner((System.in));
        System.out.println("Lutfen yasinizi girin:");
        int yas =scan.nextInt();
        if(yas<0){
            System.out.println("Lutfen gecerli bir yas giriniz :");
        } else if (yas<65){
            System.out.println("emekli olamazsin," +(65-yas)+" yil daha calismalisin");
        } else
        System.out.println("Emekli olabilirsin");

    }
}
