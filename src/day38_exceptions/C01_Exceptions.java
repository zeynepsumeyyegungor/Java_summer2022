package day38_exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {
        /*
        bir sorunla karsilasmayi bekledigimiz noktalarda
        if else ile sorunu yakalayip
        onunla ilgili cozum uretebilirsiniz
         */
        int a = 1000;
        int b = 50;
        int sayac = 1;
        while (sayac<1000){

            if (b==0){
                System.out.println(" islem yapilirken 0 oldu,dikkat etmelisiniz");
            }else {
                System.out.println(a/b);
            }
            b--;
            sayac++;
        }
    }
}
