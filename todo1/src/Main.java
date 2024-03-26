public class Main {
    public static void main(String[] args) {
        
        Anjing anjing1 = new Anjing("Bobby", "Golden Retriever", 3, "Emas", "Jantan", "Coklat");
        Anjing anjing2 = new Anjing("Luna", "Labrador Retriever", 2, "Hitam", "Betina", "Hitam");
        Anjing anjing3 = new Anjing("Max", "Siberian Husky", 5, "Abu-abu", "Jantan", "Putih");

        
        System.out.println("=== Anjing 1 ===");
        anjing1.tampilkanInfo();
        anjing1.menggonggong();
        anjing1.makan();
        anjing1.tidur();
        System.out.println();

        System.out.println("=== Anjing 2 ===");
        anjing2.tampilkanInfo();
        anjing2.menggonggong();
        anjing2.makan();
        anjing2.tidur();
        System.out.println();

        System.out.println("=== Anjing 3 ===");
        anjing3.tampilkanInfo();
        anjing3.menggonggong();
        anjing3.makan();
        anjing3.tidur();
        System.out.println();

        System.out.println("=== Anjing 4 ===");
        Anjing anjing4 = Anjing.kawin(anjing1, anjing2, "Iggy");
        anjing4.tampilkanInfo();
        anjing4.menggonggong();
        anjing4.makan();
        anjing4.tidur();
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            anjing4.ulangTahun();
        }
        anjing4.tampilkanInfo();

    }
}