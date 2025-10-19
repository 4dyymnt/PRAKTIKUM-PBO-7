/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menghitung.waktu.cetak.novel;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class MenghitungWaktuCetakNovel {

    public static void main(String[] args) {
        // Konstanta waktu
        final int DETIK_PER_MENIT = 60;
        final int DETIK_PER_JAM = 3600;
        final int DETIK_PER_HARI = 86400;

        // Input dari pengguna
        try ( // Membuat objek Scanner untuk input
                Scanner scanner = new Scanner(System.in)) {
            // Input dari pengguna
            System.out.print("Masukkan banyaknya novel yang akan dicetak: ");
            int banyakNovel = scanner.nextInt();
            System.out.print("Masukkan tebal lembar per novel (dalam lembar): ");
            int tebalLembar = scanner.nextInt();
            // Hitung total lembar
            int totalLembar = banyakNovel * tebalLembar;
            // Waktu total dalam detik (karena kecepatan 1 lembar/detik)
            int waktuDetik = totalLembar;
            // Konversi ke hari, jam, menit, detik
            int hari = waktuDetik / DETIK_PER_HARI;
            int sisaDetik = waktuDetik % DETIK_PER_HARI;
            int jam = sisaDetik / DETIK_PER_JAM;
            sisaDetik = sisaDetik % DETIK_PER_JAM;
            int menit = sisaDetik / DETIK_PER_MENIT;
            int detik = sisaDetik % DETIK_PER_MENIT;
            // Output hasil
            System.out.println("\n=== HASIL PERHITUNGAN ===");
            System.out.println("Total lembar dicetak: " + totalLembar + " lembar");
            System.out.println("Waktu yang diperlukan: " + hari + " hari, " + jam + " jam, " + menit + " menit, " + detik + " detik");
            // Tutup scanner
        }
    }
}
