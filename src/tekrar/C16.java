package tekrar;

public class C16 {
    public static void main(String[] args) {
         /*
          gunleri gösterebilen bir program yazın
          gun Pazartesi veya Sali ise:
          Java dersi gunleri

          gun Persembe veya Cuma ise:
          Selenyum dersi gunleri

          gun carsamba veya cumartesi ise:
          SQL dersi gunleri

          aksi halde: izin gunu
          (if deyimini KULLANMAYIN)
*/

        String gun = "sali";

        switch (gun) {
            case "Pazaretsi":
            case "Sali":
                System.out.println("Java Dersi.");
                break;
            case "Carsamba" :
            case "Cumartesi" :
                System.out.println("Sql Dersi.");
                break;
            case "Persembe" :
            case "Cuma" :
                System.out.println("Selenyum Dersi.");
                break;
            default:
                System.out.println("Izin gunu");
        }
    }
}
