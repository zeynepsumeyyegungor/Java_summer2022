package day07_ifStatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_BasitIfStatements {
    public static void main(String[] args) {
        /*
        Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
                  Ornek:  gun=Pazar output = “Hafta sonu”
                          gun=Sali output = “Hafta ici”
                  *** String icin equals method’unu kullanin

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini girin");

        String girilenGun = scan.next().toLowerCase();
        //Pazar,PAZAR.pazAR,PAzar ??? bilemeyiz (toLowerCase) yapip girilen yaziyi kuculturuz
        // pazar, pazar,pazar,pazar

        if (girilenGun.equals("pazar") || girilenGun.equals("cumartesi")) {
            System.out.println("Girilen Gun HAFTASONU");
        }
        if (girilenGun.equals("pazartesi") || girilenGun.equals("sali")
                || girilenGun.equals("carsamba") || girilenGun.equals("persembe")
                || girilenGun.equals("cuma")) {
            System.out.println("Girilen Gun Haftaici");
        }

            if (!(girilenGun.equals("pazartesi")
                    || girilenGun.equals("sali")
                    || girilenGun.equals("carsamba")
                    || girilenGun.equals("persembe")
                    || girilenGun.equals("cuma")
                    || girilenGun.equals("cumartesi")
                    ||  girilenGun.equals("pazar"))) {

                System.out.println("Lutfen gecerli bir gun ismi giriniz");
            }

        }
    }
