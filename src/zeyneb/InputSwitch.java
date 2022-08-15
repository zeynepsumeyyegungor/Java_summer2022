package zeyneb;

public class InputSwitch {
    public static void main(String[] args) {

         /* Kullanicidan SDET kısaltmasindaki harflerden birini yazmasini isteyin,
        S yazarsa "SOFTWARE",
        D yazarsa "DEVELOPER",
        E yazarsa "ENGINEER"
        T yazarsa "IN TESTING" yazdirin..
         */

        String imput = "D";
        switch (imput) {
            case "S" :
                System.out.println("SOFTWARE");
                break;
            case "D" :
                System.out.println("DEVELOPER");
                break;
            case "E" :
                System.out.println("ENGINEER");
                break;
            case "T" :
                System.out.println("IN TESTING");
        }
    }
}
