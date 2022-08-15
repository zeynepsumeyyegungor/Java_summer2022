package kendiYaptiklarim;

public class MdaSoru3 {
    public static void main(String[] args) {
        /*
        Soru 3) Asagidaki multi dimensional array'lerin ic array'lerinde ayni index'e sahip
        elemanlarin toplamini ekrana yazdiran bir program yaziniz.
        (Zor soru) arr1 = { {1,2},{3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }

         */

        int [][] arr1 = { {1,2},{3,4,5},{6} }, arr2 ={ {7,8,9},{10,11},{12} };

        ikiArrayTopla(arr1,arr2);
    }

    private static void ikiArrayTopla(int[][] arr1, int[][] arr2) {
        int top1=0;
        int top2=0;

        for (int i = 0; i <arr1.length ; i++) {
            for (int j = 0; j <arr1[i].length ; j++) {

                top1+= arr1 [i][j];
            }

        }

        for (int i = 0; i <arr2.length ; i++) {
            for (int j = 0; j <arr2[i].length ; j++) {

                top2+= arr2 [i][j];
            }
        }
        System.out.println("Toplamları = " + (top1+top2));
    }
}
