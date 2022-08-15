package kendiYaptiklarim;

import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {

        int arr[] = {2, 11, 0, 23, 7};
        Arrays.sort(arr);
        for (int i = 4; i >=0 ; i--) {
            System.out.print(arr[i] + " ");

        }
    }
}
