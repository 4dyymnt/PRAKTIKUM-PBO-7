import java.util.Scanner;

public class HitungPendapatanSalesman {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Meminta input pendapatan hari itu dari user
            System.out.print("Masukkan pendapatan hari ini (dalam Rupiah): ");
            double pendapatan = scanner.nextDouble();
            
            // Menghitung komisi berdasarkan ketentuan
            double uangJasa = 0;
            double komisiPersen = 0;
            
            if (pendapatan <= 2000000) {
                uangJasa = 100000;
                komisiPersen = 0.10;
            } else if (pendapatan <= 5000000) {
                uangJasa = 200000;
                komisiPersen = 0.15;
            } else {
                uangJasa = 300000;
                komisiPersen = 0.20;
            }
            
            // Menghitung uang komisi
            double uangKomisi = komisiPersen * pendapatan;
            
            // Menghitung total pendapatan
            double totalPendapatan = uangJasa + uangKomisi;
            
            // Menampilkan hasil
            System.out.println("\n=== Rincian Pendapatan Salesman ===");
            System.out.println("Pendapatan Hari Ini: Rp" + String.format("%,.0f", pendapatan));
            System.out.println("Uang Jasa: Rp" + String.format("%,.0f", uangJasa));
            System.out.println("Uang Komisi (" + (komisiPersen * 100) + "%): Rp" + String.format("%,.0f", uangKomisi));
            System.out.println("Total Pendapatan: Rp" + String.format("%,.0f", totalPendapatan));
            
        } catch (Exception e) {
            System.out.println("Input tidak valid. Harap masukkan angka untuk pendapatan.");
        }
    }
}
