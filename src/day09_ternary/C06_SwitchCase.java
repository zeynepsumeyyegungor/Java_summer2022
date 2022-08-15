package day09_ternary;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {

        /*kullanicidan gun ismini alin,
        haftaici mi haftasonu mu oldugunu girin
         */

        String input = "pazar";

        switch (input) {
            case "pazartesi":
                System.out.println("Haftaici");
                break;
            case "sali":
                System.out.println("Haftaici");
                break;
            case "carsamba":
                System.out.println("Haftaici");
                break;
            case "persembe":
                System.out.println("Haftaici");
                break;
            case "cuma":
                System.out.println("Haftaici");
                break;
            case "camurtesi":
                System.out.println("Haftasonu");
                break;
            case "pazar":
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("lutfen gecerli bir gun girin");


        /*kullanicidan gun ismini alin,
        haftaici mi haftasonu mu oldugunu girin
         */


        }
    switch (input) {
        case "pazartesi":
        case "sali":
        case "carsamba":
        case "persembe":
        case "cuma":
            System.out.println("Haftaici");
            break;
        case "cumartesi":
        case "pazar":
            System.out.println("Haftasonu");
            break;
        default:
            System.out.println("lutfen gecerli bir gun girin");
    }}}