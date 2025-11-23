import java.util.Scanner;

public class MenebakTahun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input bulan dan tanggal
        System.out.print("Masukkan bulan lahir (1-12): ");
        int bulan = scanner.nextInt();
        
        System.out.print("Masukkan tanggal lahir (1-31): ");
        int tanggal = scanner.nextInt();
        
        // Memanggil method berparameter untuk menghitung angka trik
        int hasil = hitungAngka(bulan, tanggal);
        
        // Menampilkan hasil akhir
        System.out.println("Hasil akhir (angka yang mengartikan bulan dan tanggal): " + hasil);
        
        scanner.close();
    }
    
    // Method berparameter untuk menghitung angka trik menebak
    public static int hitungAngka(int bulan, int tanggal) {
        // Rumus trik: (bulan * 2 + 5) * 50 + tanggal - 250
        return ((bulan * 2 + 5) * 50 + tanggal) - 250;
    }
}