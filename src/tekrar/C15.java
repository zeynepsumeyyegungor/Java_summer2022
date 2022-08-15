package tekrar;

public class C15 {
    public static void main(String[] args) {
        /*
           Final notu tanimlayin, Nested Ternary ile cozunuz
           'A'  ->  "Gayet Basarili"
           'B'  ->  "Basarili"
           'C'  ->   "Ha gayret"
           bu notlar disindakilere de Digerleri.. yazdiriniz
           */

        char finalNotu = 'C';
        String resault = finalNotu== 'A' ? "Gayet Basarili" : finalNotu== 'B' ? "Basarili" : finalNotu== 'C' ? "Ha Gayret" : "Digerleri...";
        System.out.println("resault = " + resault);
    }
}
