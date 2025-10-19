/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menghitung.selisih.waktu;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class MenghitungSelisihWaktu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input waktu pertama
        System.out.print("Masukkan waktu pertama (format HH:MM): ");
        String waktu1Str = scanner.nextLine();

        // Input waktu kedua
        System.out.print("Masukkan waktu kedua (format HH:MM): ");
        String waktu2Str = scanner.nextLine();

        try {
            // Parse string ke LocalTime
            LocalTime waktu1 = LocalTime.parse(waktu1Str);
            LocalTime waktu2 = LocalTime.parse(waktu2Str);

            // Hitung durasi antara dua waktu
            Duration durasi = Duration.between(waktu1, waktu2);

            // Jika hasil negatif (waktu kedua lebih kecil), ubah jadi positif
            if (durasi.isNegative()) {
                durasi = durasi.abs();
            }

            // Ekstrak jam, menit, dan detik
            long jam = durasi.toHours();
            long menit = durasi.toMinutes() % 60;
            long detik = durasi.getSeconds() % 60;

            // Tampilkan hasil
            System.out.println("Selisih waktu: " + jam + " jam, " + menit + " menit, " + detik + " detik.");

        } catch (Exception e) {
            System.out.println("Format waktu tidak valid. Gunakan format HH:MM (contoh: 14:30).");
        }

        scanner.close();
    }
}
