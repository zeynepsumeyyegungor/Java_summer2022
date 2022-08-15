package day33_encapsulation;

public class Araba {
    String marka="Marka belirtilmedi";  // marka'nin access modifier'i default access modifier
                                        // oldugundan, package icerisinde kullanilabilir

    String model="Model belirtilmedi";
    String yakit="Elektrikli";// tum arabalar elektrikli ise bu variable'in degistirilmemesi lazim
    // private yaptigimiz model ve yakit variable'larina erisimi yetkilendirelim
    // model'e deger atanabilsin ama gorulemesin(setter)
    // yakit ise gorulebilsin ama yeni deger atanamasin isteniyor (getter)


    public String getYakit() {
        return yakit;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
