package day32_stringBuilder;

public class C02_Append {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("Java daha ne yapsin");

        sb.append("?");

        System.out.println(sb);  //Java daha ne yapsin?

        //append istedigimiz String'i en sona ekler
    }
}
