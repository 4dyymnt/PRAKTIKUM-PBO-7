// File: Produk.java
class Produk {
    protected String judul;
    protected String penulis;

    // Constructor
    public Produk(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    // Method dasar untuk mendapatkan info (akan dioverride di subclass)
    public String getInfoProduk() {
        return "Produk: " + this.judul + " | Penulis: " + this.penulis;
    }
}

// File: Komik.java
class Komik extends Produk {
    private int jumlahHalaman; // Properti baru

    // Constructor yang menerima judul, penulis, dan jumlahHalaman
    public Komik(String judul, String penulis, int jumlahHalaman) {
        super(judul, penulis); // Memanggil constructor kelas Produk
        this.jumlahHalaman = jumlahHalaman;
    }

    // Meng-override method dari kelas Produk
    @Override
    public String getInfoProduk() {
        return "Komik: " + judul + " | Penulis: " + penulis + " | Halaman: " + jumlahHalaman + " Hal";
    }
}

// File: Games.java
class Games extends Produk {
    private double waktuMain; // Properti baru (dalam jam)

    // Constructor yang menerima judul, penulis, dan waktuMain
    public Games(String judul, String penulis, double waktuMain) {
        super(judul, penulis); // Memanggil constructor kelas Produk
        this.waktuMain = waktuMain;
    }

    // Meng-override method dari kelas Produk
    @Override
    public String getInfoProduk() {
        return "Games: " + judul + " | Pengembang: " + penulis + " | Waktu Main: " + waktuMain + " Jam";
    }
}

// File: Main.java (Kelas Utama)
public class Main {
    public static void main(String[] args) {
        // Membuat objek Komik dengan properti tambahan
        Komik komik2 = new Komik("Naruto", "Masashi Kishimoto", 72); 
        
        // Membuat objek Games dengan properti tambahan
        Games games2 = new Games("The Witcher 3: Wild Hunt", "CD Projekt Red", 150.5);

        // Memanggil method getInfoProduk
        System.out.println("--- Info Produk Terbaru ---");
        System.out.println(komik2.getInfoProduk());
        System.out.println(games2.getInfoProduk());
    }
}