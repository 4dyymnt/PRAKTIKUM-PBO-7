/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kecepetan.cahaya;

/**
 *
 * @author USER
 */
public class KecepetanCahaya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Deklarasi variabel jarak dan kecepatan (dalam km dan km/s)
        double jarakBulan = 384000.0;  // km
        double jarakMatahari = 151000000.0;  // 151 juta km
        double kecepatanCahaya = 300000.0;  // km/s
        
        // Hitung waktu ke Bulan (detik)
        double waktuBulanDetik = jarakBulan / kecepatanCahaya;
        double waktuBulanMenit = waktuBulanDetik / 60;
        double waktuBulanJam = waktuBulanMenit / 60;
        
        // Hitung waktu ke Matahari (detik)
        double waktuMatahariDetik = jarakMatahari / kecepatanCahaya;
        double waktuMatahariMenit = waktuMatahariDetik / 60;
        double waktuMatahariJam = waktuMatahariMenit / 60;
        
        // Output hasil
        System.out.println("Jarak ke Bulan: " + jarakBulan + " km");
        System.out.println("Waktu ke Bulan: " + String.format("%.2f", waktuBulanDetik) + " detik (atau " 
                          + String.format("%.2f", waktuBulanMenit) + " menit, " + String.format("%.2f", waktuBulanJam) + " jam)");
        
        System.out.println("\nJarak ke Matahari: " + jarakMatahari + " km");
        System.out.println("Waktu ke Matahari: " + String.format("%.2f", waktuMatahariDetik) + " detik (atau " 
                          + String.format("%.2f", waktuMatahariMenit) + " menit, " + String.format("%.2f", waktuMatahariJam) + " jam)");

    }
    
}
