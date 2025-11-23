import java.util.Scanner;  // Untuk input dari pengguna

public class MenghitungKelilingP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input panjang dan lebar
        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = scanner.nextDouble();
        
        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = scanner.nextDouble();
        
        // Memanggil method untuk menghitung keliling
        double keliling = hitungKeliling(panjang, lebar);
        
        // Menampilkan hasil
        System.out.println("Keliling persegi panjang adalah: " + keliling);
        
        scanner.close();
    }
    
    // Method untuk menghitung keliling persegi panjang
    public static double hitungKeliling(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }
}