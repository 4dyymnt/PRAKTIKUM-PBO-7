/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menghitung.buah.dengan.buffered.reader.inputstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author USER
 */
public class MenghitungBuahDenganBufferedReaderInputStream {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Input jumlah mangga dibeli
            System.out.print("Masukkan jumlah mangga dibeli (pcs): ");
            int manggaDibeli = Integer.parseInt(br.readLine());

            // Input jumlah tetangga
            System.out.print("Masukkan jumlah tetangga: ");
            int jumlahTetangga = Integer.parseInt(br.readLine());

            // Input buah jambu per tetangga
            System.out.print("Masukkan buah jambu per tetangga (pcs): ");
            int jambuPerTetangga = Integer.parseInt(br.readLine());

            // Hitung total jambu dibeli (diasumsikan sama dengan yang dibagikan)
            int totalJambu = jumlahTetangga * jambuPerTetangga;

            // Total buah dibeli (awal, sebelum pengembalian)
            int totalBuahDibeli = manggaDibeli + totalJambu;

            // Output hasil
            System.out.println("\n--- Hasil Perhitungan ---");
            System.out.println("Mangga dibeli: " + manggaDibeli + " pcs");
            System.out.println("Total jambu dibeli: " + totalJambu + " pcs");
            System.out.println("Total buah dibeli: " + totalBuahDibeli + " pcs");

            // Optional: Hitung net setelah pengembalian (tidak diminta, tapi informatif)
            System.out.print("Masukkan jumlah mangga busuk dikembalikan (pcs): ");
            int manggaBusuk = Integer.parseInt(br.readLine());

            int netMangga = manggaDibeli - manggaBusuk;
            int netTotal = netMangga + totalJambu;

            System.out.println("Net mangga setelah dikembalikan: " + netMangga + " pcs");
            System.out.println("Net total buah: " + netTotal + " pcs");

        } catch (IOException | NumberFormatException e) {
            System.out.println("Error: Input tidak valid. Gunakan angka bulat.");
        }
    }
}