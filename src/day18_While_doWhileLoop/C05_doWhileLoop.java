package day18_While_doWhileLoop;

public class C05_doWhileLoop {
    public static void main(String[] args) {

        //  9'dan 190'a kadar 7'nin kati olan tum tamsayilari ekrana yazdirin..

        int bas = 9;
        int son = 190;
        int temp = bas;

        // while loop ile yapiyorum

        while (temp<son){

            if(temp%7==0){
                System.out.print(temp + " ");
            }
            temp++;

        }
        System.out.println("");
        System.out.println("* * *");
        //do-while ile yapiyorum
        temp=bas;
        do {
            if (temp%7==0){
                    System.out.print(temp + " ");
                }
                temp++;
            }while (temp<son);
        }
    }

