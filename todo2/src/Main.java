import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        // Tanggal awal
        LocalDate tanggalAwal = LocalDate.of(2005, 5, 6);
        // Tanggal akhir
        LocalDate tanggalAkhir = LocalDate.of(2024, 1, 4);

        // Menghitung selisih antara dua tanggal
        Period periode = Period.between(tanggalAwal, tanggalAkhir);

        // Mendapatkan tahun, bulan, dan hari dari periode
        int tahun = periode.getYears();
        int bulan = periode.getMonths();
        int hari = periode.getDays();

        // Menampilkan hasil konversi
        System.out.println("Hasil konversi dari " + tanggalAwal + " ke " + tanggalAkhir + ":");
        System.out.println("Tahun: " + tahun);
        System.out.println("Bulan: " + bulan);
        System.out.println("Hari: " + hari);
    }
}
