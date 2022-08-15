package day10_stringManipulation;

public class C01_charAt {
    public static void main(String[] args) {

        String str = "Java ogrenmek ne guzel";

        System.out.println(str.charAt(0)); //ilk harfi yazdirir J

        System.out.println(str.toUpperCase().charAt(7)); // 7. harfi buyuk hazdirir R

        System.out.println(str.charAt(21));

        // System.out.println(str.charAt(22));
        // StringIndexOutOfBoundsException , verdigin deger cumleden fazla
        // son harfi bulmak icin str'in uzunlugunun 1 eksigini index olarak gireriz
        // eger index olarak uzunlugu veya daha sayiyi girersek Java exception verir

        //charAt() kullandigimizda sonuc char olacagi icin artik manipulation yapamayiz
        // String method'larindan kullanmamiz gereken bir method varsa
        // charAt() 'den once kullanmaliyiz.
    }
}
