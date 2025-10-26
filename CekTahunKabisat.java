import java.util.Scanner;

public class CekTahunKabisat {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Meminta input tahun dari user
            System.out.print("Masukkan tahun: ");
            int tahun = scanner.nextInt();
            
            // Mengecek apakah tahun kabisat
            boolean isKabisat = false;
            if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
                isKabisat = true;
            }
            
            // Menampilkan hasil
            if (isKabisat) {
                System.out.println("Tahun " + tahun + " adalah tahun kabisat.");
            } else {
                System.out.println("Tahun " + tahun + " bukan tahun kabisat.");
            }
        } catch (Exception e) {
            System.out.println("Input tidak valid. Harap masukkan bilangan bulat untuk tahun.");
        }
    }
}
