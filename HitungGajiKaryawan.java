import java.util.Scanner;

public class HitungGajiKaryawan {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Meminta input data karyawan
            System.out.print("Masukkan NIK: ");
            String nik = scanner.nextLine();
            
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            
            System.out.print("Masukkan Kode Golongan (1-4): ");
            int kodeGolongan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline
            
            System.out.print("Masukkan Status Pernikahan (menikah/belum/cerai): ");
            String statusPernikahan = scanner.nextLine().toLowerCase();
            
            System.out.print("Masukkan Jumlah Anak: ");
            int jumlahAnak = scanner.nextInt();
            
            // Menentukan gaji pokok berdasarkan kode golongan
            double gajiPokok = 0;
            switch (kodeGolongan) {
                case 1:
                    gajiPokok = 1200000;
                    break;
                case 2:
                    gajiPokok = 1500000;
                    break;
                case 3:
                    gajiPokok = 1750000;
                    break;
                case 4:
                    gajiPokok = 2000000;
                    break;
                default:
                    System.out.println("Kode golongan tidak valid. Harap masukkan 1-4.");
                    return;
            }
            
            // Menghitung tunjangan pasangan (10% gaji pokok jika menikah)
            double tunjanganPasangan = 0;
            if (statusPernikahan.equals("menikah")) {
                tunjanganPasangan = 0.10 * gajiPokok;
            }
            
            // Menghitung tunjangan anak (5% gaji pokok * jumlah anak, jika jumlah anak > 0)
            double tunjanganAnak = 0;
            if (jumlahAnak > 0) {
                tunjanganAnak = 0.05 * gajiPokok * jumlahAnak;
            }
            
            // Menghitung total tunjangan
            double totalTunjangan = tunjanganPasangan + tunjanganAnak;
            
            // Menghitung gaji bersih
            double gajiBersih = gajiPokok + totalTunjangan;
            
            // Menampilkan hasil
            System.out.println("\n=== Slip Gaji Karyawan ===");
            System.out.println("NIK: " + nik);
            System.out.println("Nama: " + nama);
            System.out.println("Kode Golongan: " + kodeGolongan);
            System.out.println("Status Pernikahan: " + statusPernikahan);
            System.out.println("Jumlah Anak: " + jumlahAnak);
            System.out.println("Gaji Pokok: Rp" + String.format("%,.0f", gajiPokok));
            System.out.println("Tunjangan Pasangan: Rp" + String.format("%,.0f", tunjanganPasangan));
            System.out.println("Tunjangan Anak: Rp" + String.format("%,.0f", tunjanganAnak));
            System.out.println("Total Tunjangan: Rp" + String.format("%,.0f", totalTunjangan));
            System.out.println("Gaji Bersih: Rp" + String.format("%,.0f", gajiBersih));
            
        } catch (Exception e) {
            System.out.println("Input tidak valid. Harap masukkan data dengan benar.");
        }
    }
}
