public class SumpahPemuda {
    public static void main(String[] args) {
        // Membuat objek dari kelas SumpahPemuda
        SumpahPemuda sumpah = new SumpahPemuda();
        
        // Memanggil method untuk menampilkan tiga sumpah lanjutan
        sumpah.tampilkanSumpah();
    }
    
    // Konstruktor: Menampilkan kalimat awal
    public SumpahPemuda() {
        System.out.println("Kami putra dan putri Indonesia,");
    }
    
    // Method untuk menampilkan tiga sumpah lanjutan
    public void tampilkanSumpah() {
        System.out.println("Mengaku bertumpah darah yang satu, tanah air Indonesia.");
        System.out.println("Rakyat Indonesia yang berdaulat.");
        System.out.println("Bangsa Indonesia yang berkebudayaan.");
    }
}
