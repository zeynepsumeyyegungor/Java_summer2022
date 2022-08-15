package elifHocaDers;

public class Soru06ForLoop {
    public static void main(String[] args) {
        // 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.

     //  System.out.println("For ile");
     //  for (int i = 0; i <=255 ; i++) {
     //      char c = (char) i; //cating yaptik,sayi,harf ve karakter icin gecerli
     //      System.out.println(i + " ->"  +c);
     //  }


     //  System.out.println("While ile;");
     //  int i=0;
     //  while (i<=255){
     //      char sembol= (char) i;
     //      System.out.println(i+ " - " +sembol);
     //      i++;
     //  }

        System.out.println("Do While ile;");
        int a=0;
        do {
            char karakter = (char) a;
            System.out.println(a + " " + karakter);
            a++;

        }while (a<=255);
    }
}
