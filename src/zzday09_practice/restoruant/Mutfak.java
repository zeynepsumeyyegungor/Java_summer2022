package zzday09_practice.restoruant;

public class Mutfak {

    public String yemekler = "adanakebap, urfaciger, kusbasi, kusleme";

    public String araSicaklar = "yaylacorbasi, mercimek, duguncorbasi, corba";

    public String tatlilar = "baklava, sutlac, gullac, kazandibi, kunefe";

    public String icecekler = "ayran, salgam, kola";

    public Mutfak(String adanakebap, String mercimek, String kunefe, String salgam) {
        this.yemekler=adanakebap;
        this.araSicaklar=mercimek;
        this.tatlilar=kunefe;
        this.icecekler=salgam;
    }

    public Mutfak(){


    }

    @Override
    public String toString() {
        return "Mutfak{" +
                "\nyemekler='" + yemekler + '\'' +
                "\n, araSicaklar='" + araSicaklar + '\'' +
                "\n, tatlilar='" + tatlilar + '\'' +
                "\n, icecekler='" + icecekler + '\'' +
                '}';
    }
}
