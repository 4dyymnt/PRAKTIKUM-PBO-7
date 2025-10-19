/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aldisaputratugas.praktikum.pbo3;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class AldiSaputraTUGASPRAKTIKUMPBO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Input employee details
        try ( // TODO code application logic here
                Scanner input = new Scanner(System.in)) {
            // Input employee details
            System.out.print("Nomor Induk Karyawan: ");
            String nomorInduk = input.nextLine();
            
            System.out.print("Nama Karyawan: ");
            String namaKaryawan = input.nextLine();
            
            System.out.print("Alamat: ");
            String alamat = input.nextLine();
            
            System.out.print("Jabatan: ");
            String jabatan = input.nextLine();
            
            // Input salary components
            System.out.print("Gaji Pokok (P1): ");
            double gajiPokok = input.nextDouble();
            
            System.out.print("Tunjangan Istri (P2): ");
            double tunjanganIstri = input.nextDouble();
            
            // P3 assumed as 0 (Tunjangan Anak or third component not provided in sample)
            double tunjanganAnak = 0.0;
            
            // Calculations
            double totalGaji = gajiPokok + tunjanganIstri + tunjanganAnak;
            double pajakPenghasilan = 0.1 * totalGaji;  // 10% of Total Gaji (interpreting Gp - Tp as total for simplicity)
            double gajiBersih = totalGaji - pajakPenghasilan;
            
            // Output formatted like the form
            System.out.println("\n=== SLIP GAJI KARYAWAN ===");
            System.out.println("Nomor Induk Karyawan\t: " + nomorInduk);
            System.out.println("Nama Karyawan\t\t: " + namaKaryawan);
            System.out.println("Alamat\t\t\t: " + alamat);
            System.out.println("Jabatan\t\t\t: " + jabatan);
            System.out.println("Gaji Pokok\t\t: " + formatRupiah(gajiPokok));
            System.out.println("Tunjangan Istri\t\t: " + formatRupiah(tunjanganIstri));
            System.out.println("Tunjangan Anak (P3)\t: " + formatRupiah(tunjanganAnak));
            System.out.println("Total Gaji (P1 + P2 + P3)\t: " + formatRupiah(totalGaji));
            System.out.println("Pajak Penghasilan (10% x Total Gaji)\t: " + formatRupiah(pajakPenghasilan));
            System.out.println("Gaji Bersih\t\t: " + formatRupiah(gajiBersih));
        }
    }
    
    // Helper method to format numbers as Rupiah (e.g., 3000000 -> Rp 3,000,000)
    private static String formatRupiah(double amount) {
        java.text.DecimalFormat formatter = new java.text.DecimalFormat("#,###");
        return "Rp " + formatter.format(amount);
                return (null);
}
}