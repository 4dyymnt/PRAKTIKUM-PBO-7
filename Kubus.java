public class Kubus {
    // Atribut dengan tingkat akses private (hanya bisa diakses dalam kelas ini)
    private double sisi;

    // Konstruktor public untuk menginisialisasi sisi kubus
    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    // Metode public untuk menghitung volume kubus
    public double hitungVolume() {
        return sisi * sisi * sisi;  // Atau bisa gunakan Math.pow(sisi, 3)
    }

    // Metode main public untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek Kubus dengan sisi 5
        Kubus kubus = new Kubus(5.0);
        
        // Menghitung dan menampilkan volume
        double volume = kubus.hitungVolume();
        System.out.println("Volume kubus dengan sisi 5 adalah: " + volume);
    }
}