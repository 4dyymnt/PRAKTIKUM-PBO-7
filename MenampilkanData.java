import java.util.Scanner;  // Untuk input dari pengguna

public class MenampilkanData {
    private String nama;
    private String npm;
    private String kelas;
    
    // Konstruktor menggunakan kata kunci this
    public MenampilkanData(String nama, String npm, String kelas) {
        this.nama = nama;   // this.nama merujuk ke atribut instance
        this.npm = npm;     // this.npm merujuk ke atribut instance
        this.kelas = kelas; // this.kelas merujuk ke atribut instance
    }
    
    // Method untuk menampilkan data menggunakan kata kunci this
    public void tampilkanData() {
        System.out.println("Nama: " + this.nama);   // this.nama merujuk ke atribut instance
        System.out.println("NPM: " + this.npm);     // this.npm merujuk ke atribut instance
        System.out.println("Kelas: " + this.kelas); // this.kelas merujuk ke atribut instance
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input data dari pengguna
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan NPM: ");
        String npm = scanner.nextLine();
        
        System.out.print("Masukkan kelas: ");
        String kelas = scanner.nextLine();
        
        // Membuat objek MenampilkanData dengan data input
        MenampilkanData mahasiswa = new MenampilkanData(nama, npm, kelas);
        
        // Menampilkan data
        System.out.println("\n=== Data Mahasiswa ===");
        mahasiswa.tampilkanData();
        
        scanner.close();
    }
}
