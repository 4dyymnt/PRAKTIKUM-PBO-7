public class Segitiga {
    // Atribut dengan tingkat akses protected
    protected double alas;
    protected double tinggi;

    // Konstruktor untuk menginisialisasi alas dan tinggi
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // Metode protected untuk menghitung luas segitiga
    protected double hitungLuas() {
        return (alas * tinggi) / 2;
    }

    // Metode main untuk menjalankan program (public agar bisa diakses dari luar)
    public static void main(String[] args) {
        // Membuat objek Segitiga dengan alas 5 dan tinggi 10
        Segitiga segitiga = new Segitiga(5.0, 10.0);
        
        // Mengakses metode protected (karena dalam kelas yang sama)
        double luas = segitiga.hitungLuas();
        
        // Menampilkan hasil
        System.out.println("Luas segitiga dengan alas 5 dan tinggi 10 adalah: " + luas);
    }
}