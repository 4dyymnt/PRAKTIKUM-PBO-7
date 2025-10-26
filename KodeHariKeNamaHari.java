import java.util.Scanner;

public class KodeHariKeNamaHari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Masukkan kode hari (1-7): ");
            int kodeHari = scanner.nextInt();
            
            String namaHari;
            switch (kodeHari) {
                case 1:
                    namaHari = "Senin";
                    break;
                case 2:
                    namaHari = "Selasa";
                    break;
                case 3:
                    namaHari = "Rabu";
                    break;
                case 4:
                    namaHari = "Kamis";
                    break;
                case 5:
                    namaHari = "Jumat";
                    break;
                case 6:
                    namaHari = "Sabtu";
                    break;
                case 7:
                    namaHari = "Minggu";
                    break;
                default:
                    namaHari = "Kode hari tidak valid. Harap masukkan angka 1-7.";
                    break;
            }
            
            // Menampilkan hasil
            System.out.println("Nama hari: " + namaHari);
        } catch (Exception e) {
            System.out.println("Input tidak valid. Harap masukkan bilangan bulat antara 1-7.");
        } finally {
            scanner.close();
        }
    }
}
