package zeyneb;

import java.util.Scanner;

public class Deneme9_switch {
    public static void main(String[] args) {
        /* Kullanicidan SDET kısaltmasindaki harflerden birini yazmasini isteyin,
        S yazarsa "SOFTWARE",
        D yazarsa "DEVELOPER",
        E yazarsa "ENGINEER"
        T yazarsa "IN TESTING" yazdirin..
         */

        Scanner scan = new Scanner(System.in);
        System.out.print(" SDET harflerinden birini giriniz.  :");
        char giris =scan.next().toUpperCase().charAt(0);
        switch (giris){
            case 'S':
                System.out.println("softwore");
                break;
            case 'D':
                System.out.println("devoloper");
                break;
            case 'E':
                System.out.println("enginer");
                break;
            case 'T':
                System.out.println("in testing");
                break;
            default:
                System.out.println("geçerli bir harf giriniz");
        }}}
