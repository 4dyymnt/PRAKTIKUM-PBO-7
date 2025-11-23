import java.util.Scanner;  // Untuk input dari pengguna

public class Rekursif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input angka untuk faktorial
        System.out.print("Masukkan angka untuk menghitung faktorial: ");
        int n = scanner.nextInt();
        
        // Memanggil method rekursif faktorial
        long hasil = faktorial(n);
        
        // Menampilkan hasil
        System.out.println("Faktorial dari " + n + " adalah: " + hasil);
        
        scanner.close();
    }
    
    // Method rekursif untuk menghitung faktorial
    public static long faktorial(int n) {
        // Kasus dasar (base case): jika n <= 1, kembalikan 1
        if (n <= 1) {
            return 1;
        }
        // Kasus rekursif: n * faktorial(n-1)
        return n * faktorial(n - 1);
    }
}