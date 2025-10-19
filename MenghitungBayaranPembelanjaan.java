/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menghitung.bayaran.pembelanjaan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author USER
 */
public class MenghitungBayaranPembelanjaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Inisialisasi input stream menggunakan BufferedReader untuk kompatibilitas DataInputStream-like
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            // Input Nama Pembeli
            System.out.print("Nama Pembeli: ");
            String nama = br.readLine();
            
            // Input Total Belanja
            System.out.print("Total Belanja: ");
            double totalBelanja = Double.parseDouble(br.readLine());
            
            // Input Diskon (%)
            System.out.print("Diskon (%): ");
            double diskon = Double.parseDouble(br.readLine());
            
            // Input Bayar
            System.out.print("Bayar: ");
            double bayar = Double.parseDouble(br.readLine());
            
            // Perhitungan
            double jumlahDiskon = totalBelanja * (diskon / 100);
            double totalBayar = totalBelanja - jumlahDiskon;
            double kembalian = bayar - totalBayar;
            
            // Output hasil (menggunakan PrintStream untuk simulasi DataOutputStream-like)
            System.out.println("\n=== Struk Pembayaran ===");
            System.out.println("Nama Pembeli: " + nama);
            System.out.println("Total Belanja: Rp " + totalBelanja);
            System.out.println("Diskon (" + diskon + "%): Rp " + jumlahDiskon);
            System.out.println("Total Bayar: Rp " + totalBayar);
            System.out.println("Bayar: Rp " + bayar);
            System.out.println("Kembalian: Rp " + kembalian);
            System.out.println("========================");
            
        } catch (IOException e) {
            System.out.println("Error input/output: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Input harus berupa angka untuk total, diskon, dan bayar.");
        }
        
    }
  }
}
