package day17_nestedForLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {
        /*Verilen String'i asagidaki gibi yazdiran
        bir program yazin.
        input=Deniz

        D
        De
        Den
        Deni
        Deniz
         */


        String input= "Izmir";

        for (int i = 1; i <=input.length() ; i++) {
            for (int j = 1; j<=i ; j++) {
                System.out.print(input.substring(j-1,j));
            }
            System.out.println("");
        }
    }
}
