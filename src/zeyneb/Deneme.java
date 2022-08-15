package zeyneb;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {

        Scanner dersNotu = new Scanner(System.in);
        System.out.println("lutfen notunuzu girin");
        double dersNotu1 = dersNotu.nextDouble();

         double dersNotu2 =dersNotu.nextDouble();

         double dersNotu3 =dersNotu.nextDouble();

         double ort = (dersNotu1+dersNotu2+dersNotu3)/3 ;

        System.out.println("ortalama :" +ort );




    }

}

