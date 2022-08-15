package day34_inheeritance;

public class Toyota {

   protected String marka="Toyota";
   protected String model="Model Belitilmedi";
   protected String yakit="Yakit Belitilmedi";

   protected void motor(){
       System.out.println("Toyota cevreci motorlar kullanir");
   }

   protected void aku(){
       System.out.println("Toyota modele gore aku uretir");
   }
}
