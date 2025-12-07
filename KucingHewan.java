// Kelas induk Hewan
class KucingHewan {
    protected String nama;  // Menggunakan protected agar dapat diakses oleh subclass

    // Konstruktor Hewan
    public Hewan(String nama) {
        this.nama = nama;
    }

    // Method makan
    public void makan() {
        System.out.println(nama + " sedang makan.");
    }
}

// Kelas Kucing yang extends Hewan
public class KucingHewan {
    // Konstruktor untuk menginisialisasi nama (memanggil konstruktor parent)
    public Kucing(String nama) {
        super(nama);  // Memanggil konstruktor Hewan
    }

    // Method display yang mengembalikan nilai nama hewan
    public String display() {
        return nama;  // Mengembalikan nama dari property parent (sekarang protected, jadi bisa diakses)
    }

    // Method main untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek Kucing dengan nama "Tom"
        Kucing kucing = new Kucing("Tom");
        
        // Memanggil method makan dari parent class
        kucinghewan.makan();
        
        // Memanggil method display dan menampilkan hasil
        String namaHewan = kucing.display();
        System.out.println("Nama hewan: " + namaHewan);
    }
}
