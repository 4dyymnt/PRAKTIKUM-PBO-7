import java.util.Scanner;

public class KasirSederhana {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Meminta input total belanja
            System.out.print("Masukkan total belanja (dalam Rupiah): ");
            double totalBelanja = scanner.nextDouble();
            
            // Meminta input apakah memiliki kartu member
            System.out.print("Apakah memiliki kartu member? (ya/tidak): ");
            String memilikiMember = scanner.next().toLowerCase();
            
            // Menghitung diskon berdasarkan ketentuan
            double diskon = 0;
            if (memilikiMember.equals("ya")) {
                if (totalBelanja > 500000) {
                    diskon = 50000;
                } else if (totalBelanja > 100000) {
                    diskon = 15000;
                }
            } else {
                if (totalBelanja > 100000) {
                    diskon = 10000;
                }
            }
            
            // Menghitung total yang harus dibayar
            double totalBayar = totalBelanja - diskon;
            
            // Meminta input uang yang diberikan
            System.out.print("Masukkan uang yang diberikan (dalam Rupiah): ");
            double uangDiberikan = scanner.nextDouble();
            
            // Menghitung kembalian
            double kembalian = uangDiberikan - totalBayar;
            
            // Menampilkan hasil
            System.out.println("\n=== Struk Belanja ===");
            System.out.println("Total Belanja: Rp" + String.format("%,.0f", totalBelanja));
            System.out.println("Diskon: Rp" + String.format("%,.0f", diskon));
            System.out.println("Total Bayar: Rp" + String.format("%,.0f", totalBayar));
            System.out.println("Uang Diberikan: Rp" + String.format("%,.0f", uangDiberikan));
            if (kembalian >= 0) {
                System.out.println("Kembalian: Rp" + String.format("%,.0f", kembalian));
            } else {
                System.out.println("Uang kurang: Rp" + String.format("%,.0f", Math.abs(kembalian)));
            }
            
        } catch (Exception e) {
            System.out.println("Input tidak valid. Harap masukkan angka untuk belanja dan uang.");
        }
    }
}
