public class Anjing {
    private String nama;
    private String ras;
    private int umur;
    private String warna;
    private String jenisKelamin;
    private String warnaBulu;

    public Anjing(String nama, String ras, int umur, String warna, String jenisKelamin, String warnaBulu) {
        this.nama = nama;
        this.ras = ras;
        this.umur = umur;
        this.warna = warna;
        this.jenisKelamin = jenisKelamin;
        this.warnaBulu = warnaBulu;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void ulangTahun() {
        this.umur++;
    }

    public static Anjing kawin(Anjing anjing1, Anjing anjing2, String nama) {
        Anjing anjingBaru = new Anjing(nama, anjing1.ras, 0, "Mix", "Tidak diketahui", "Tidak diketahui");
        return anjingBaru;
    }

    public void menggonggong() {
        System.out.println(nama + " sedang menggonggong!");
    }

    public void makan() {
        System.out.println(nama + " sedang makan makanan anjing.");
    }

    public void tidur() {
        System.out.println(nama + " sedang tidur.");
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Ras: " + ras);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Warna: " + warna);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Warna Bulu: " + warnaBulu);
    }

}
