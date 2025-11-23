public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas Mobil
        Mobil mobil1 = new Mobil();  // Instansiasi objek pertama
        Mobil mobil2 = new Mobil();  // Instansiasi objek kedua
        
        // Mengatur atribut objek
        mobil1.setMerk("Toyota");
        mobil1.setWarna("Merah");
        
        mobil2.setMerk("Honda");
        mobil2.setWarna("Biru");
        
        // Mengakses metode objek
        mobil1.tampilkanInfo();
        mobil2.tampilkanInfo();
    }
}

// Kelas Mobil sebagai blueprint
class Mobil {
    // Atribut (variabel instance)
    private String merk;
    private String warna;
    
    // Konstruktor default
    public Mobil() {
        // Inisialisasi default (opsional)
    }
    
    // Metode setter untuk mengatur atribut
    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public void setWarna(String warna) {
        this.warna = warna;
    }
    
    // Metode untuk menampilkan informasi objek
    public void tampilkanInfo() {
        System.out.println("Mobil merk: " + merk + ", Warna: " + warna);
    }
}